# Copyright (C) 2013 Timesys Corporation
# Released under the MIT license (see COPYING.MIT for the terms)
include linux-imx.inc

# Revision of 3.0-mvf branch
SRC_URI = "git://github.com/Timesys/linux-timesys.git \
           file://defconfig \
"

SRCREV = "2c4ead2dd6da019f5052a69b12c8f5b6b71f8dca"
LOCALVERSION = "-3.0-mvf+yocto"

COMPATIBLE_MACHINE = "(vf60)"
