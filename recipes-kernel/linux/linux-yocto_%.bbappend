FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://0001-bbb-smartfarm-dts.patch"
SRC_URI += "file://bbb_smartfarm.cfg"

KERNEL_CONFIG_FRAGMENTS:append = " ${WORKDIR}/bbb_smartfarm.cfg"

COMPATIBLE_MACHINE:append = "|beaglebone-yocto-smartfarm"
KMACHINE:beaglebone-yocto-smartfarm = "beaglebone"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-yocto"