require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"
COMPATIBLE_MACHINE = "(mxs|mx3|mx5|mx6)"

DEPENDS_mxs += "elftosb-native"

PROVIDES += "u-boot"

PV = "v2013.07"

SRCREV = "d5ab097f918d09eb9e31f6b46d8e1ceb6ec44c41"
SRC_URI = "git://github.com/Freescale/u-boot-imx.git"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
