SUMMARY = "Qt smart farm"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "2da2502a39a8245567021d35c295e045a66a4773"
SRC_URI = "git://github.com/Leminuos/QT5_SmartFarm.git;protocol=https;branch=master"
SRC_URI += "file://qtsmartfarm.service"

S = "${WORKDIR}/git"

inherit cmake_qt5 systemd

DEPENDS += " qtbase qtdeclarative qtsvg libgpiod mosquitto"

SYSTEMD_SERVICE:${PN} = "qtsmartfarm.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/QT5_SmartFarm ${D}${bindir}/QT5_SmartFarm

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/qtsmartfarm.service ${D}${systemd_system_unitdir}/
}

FILES:${PN} += "${bindir}/QT5_SmartFarm"
FILES:${PN} += "${systemd_system_unitdir}/qtsmartfarm.service"