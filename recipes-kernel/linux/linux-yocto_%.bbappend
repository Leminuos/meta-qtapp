FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://0001-bbb-smartfarm-dts.patch"
SRC_URI += "file://bbb_smartfarm.cfg"

KERNEL_CONFIG_FRAGMENTS:append = " ${WORKDIR}/bbb_smartfarm.cfg"