require recipes-extended/images/core-image-full-cmdline.bb

IMAGE_INSTALL:append = " openssh openssh-sshd openssh-sftp-server \
                         kernel-modules \
                         evtest \
                         i2c-tools \
                         libgpiod-tools libgpiod \
                         tslib tslib-calibrate tslib-tests \
                         ttf-dejavu-sans fontconfig \
                         qtbase \
                         mosquitto mosquitto-dev libmosquitto1 mosquitto-clients \
                         qtsmartfarm bbb-static-ip"