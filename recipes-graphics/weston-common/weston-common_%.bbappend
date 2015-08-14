
do_install_append() {
    # Set Weston resolution
    if [ -n "${HDMI_480P}" ]; then
       MODE="720x480"
    fi

    if [ -n "${HDMI_720P}" ]; then
       MODE="1280x720"
    fi

    if [ -n "${HDMI_1080P}" ]; then
       MODE="1920x1080"
    fi

    if [ -n "${HDMI_800_600}" ]; then
       MODE="800x600"
    fi

    if [ -n "${HDMI_1024_768}" ]; then
       MODE="1024x768"
    fi

    if [ -n "${HDMI_1440_900}" ]; then
       MODE="1440x900"
    fi

    if [ -n "${MODE}" ]; then
        echo "[output]" >> ${D}${sysconfdir}/xdg/weston/weston.ini
        echo "name=HDMI1" >> ${D}${sysconfdir}/xdg/weston/weston.ini
        echo "mode=${MODE}" >> ${D}${sysconfdir}/xdg/weston/weston.ini
    fi
}

