# Most stuff came from ./meta-tizen/meta-tizen-common-base/recipes-image/images/tizen-core-image-minimal.bb

SUMMARY = "A very basic Wayland image with a terminal"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland pam"

CORE_IMAGE_BASE_INSTALL += "weston weston-init"

DESCRIPTION = "A weston image with Tizen common."

DEPENDS += " tar-replacement-native "

CORE_IMAGE_BASE_INSTALL += "connman"
CORE_IMAGE_BASE_INSTALL += "${WESTONSTARTUP}"

# Profile specific configuration - default is Tizen common
CORE_IMAGE_BASE_INSTALL += "${IMAGECONFIG}"

CORE_IMAGE_BASE_INSTALL += "tlm"
CORE_IMAGE_BASE_INSTALL += "${TLMCONFIG}"


# Removed x86 mesa-specific stuff
CORE_IMAGE_BASE_INSTALL += "gum-utils"
CORE_IMAGE_BASE_INSTALL += "meta-common"
CORE_IMAGE_BASE_INSTALL += "pam"
CORE_IMAGE_BASE_INSTALL += "user-session-units"
CORE_IMAGE_BASE_INSTALL += "default-ac-domains"
CORE_IMAGE_BASE_INSTALL += "rpm-security-plugin"
CORE_IMAGE_BASE_INSTALL += "config-image"
CORE_IMAGE_BASE_INSTALL += "kernel-modules"
CORE_IMAGE_BASE_INSTALL += "less"
CORE_IMAGE_BASE_INSTALL += "bash"
CORE_IMAGE_BASE_INSTALL += "psmisc"
CORE_IMAGE_BASE_INSTALL += "coreutils"
CORE_IMAGE_BASE_INSTALL += "procps"

# Our specific packages
CORE_IMAGE_BASE_INSTALL += "userland"
CORE_IMAGE_BASE_INSTALL += "v4l-utils"

# From meta-tizen/meta-tizen-common-base/recipes-image/images/tizen-common-core-image-minimal.bb
CORE_IMAGE_BASE_INSTALL += "weston-common-tz-launcher"
CORE_IMAGE_BASE_INSTALL += "weston-common-config"
CORE_IMAGE_BASE_INSTALL += "desktop-skin"
CORE_IMAGE_BASE_INSTALL += "packagegroup-tizen-gstreamer"
CORE_IMAGE_BASE_INSTALL += "gstreamer1.0-plugins-bad gstreamer1.0-plugins-good gstreamer1.0-plugins-ugly"

# Fonts
CORE_IMAGE_EXTRA_INSTALL += "packagegroup-tizen-fonts-ttf"
CORE_IMAGE_EXTRA_INSTALL += "packagegroup-tizen-fonts-pango"

export SYSROOT = "${IMAGE_ROOTFS}"
