# Copyright (C) 2013 Timesys Corporation
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-bsp/u-boot/u-boot.inc
DESCRIPTION = "U-boot bootloader for vybrid platforms"

PROVIDES += "u-boot"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

SRC_URI = "git://github.com/Timesys/u-boot-timesys.git"

# Revision of 2011.12-mvf branch
SRCREV = "d958fc844f245394d6926930ad9f24a01ba51e3c"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(vf60)"
