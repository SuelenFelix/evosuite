package icu.samnyan.aqua.sega.maimai.model.response;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_setGameSetting_8740735263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;
     Object term499;

    public GetGameSettingResp_setGameSetting_8740735263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term422 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term420, term420.getClass(), "isAouAccession", true);
        setBooleanField(term422, term422.getClass(), "isMaintenance", false);
        setIntField(term422, term422.getClass(), "requestInterval", -1339778481);
        setField(term422, term422.getClass(), "rebootStartTime", "HyxfbSQYBe");
        setField(term422, term422.getClass(), "rebootEndTime", "pCTimMblYc");
        setIntField(term422, term422.getClass(), "movieUploadLimit", 1725571209);
        setIntField(term422, term422.getClass(), "movieStatus", -522618178);
        setField(term422, term422.getClass(), "movieServerUri", "hNxWaHcfhY");
        setField(term422, term422.getClass(), "deliverServerUri", "RkybSrpybU");
        setField(term422, term422.getClass(), "oldServerUri", "xOEqzGAmDU");
        setField(term422, term422.getClass(), "usbDlServerUri", "eZFUvlxvGV");
        setField(term420, term420.getClass(), "gameSetting", term422);
        term499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term499, term499.getClass(), "isMaintenance", true);
        setIntField(term499, term499.getClass(), "requestInterval", 1134449235);
        setField(term499, term499.getClass(), "rebootStartTime", "BYqFIqCKAV");
        setField(term499, term499.getClass(), "rebootEndTime", "vrQLuWIDJX");
        setIntField(term499, term499.getClass(), "movieUploadLimit", -883034806);
        setIntField(term499, term499.getClass(), "movieStatus", 1585847225);
        setField(term499, term499.getClass(), "movieServerUri", "flxyYxBRtu");
        setField(term499, term499.getClass(), "deliverServerUri", "OclPbYPkcH");
        setField(term499, term499.getClass(), "oldServerUri", "IoAlmYsBwc");
        setField(term499, term499.getClass(), "usbDlServerUri", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Object[] args = new Object[1];
        args[0] = term499;
        callMethod(klass, "setGameSetting", argTypes, term420, args);
    }

};


