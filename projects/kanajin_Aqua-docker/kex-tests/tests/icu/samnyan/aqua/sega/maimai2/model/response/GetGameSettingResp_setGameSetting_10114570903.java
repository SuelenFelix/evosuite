package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_setGameSetting_10114570903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423;
     Object term503;

    public GetGameSettingResp_setGameSetting_10114570903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        Object term425 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term423, term423.getClass(), "isAouAccession", true);
        setBooleanField(term425, term425.getClass(), "isMaintenance", false);
        setIntField(term425, term425.getClass(), "requestInterval", 1134449235);
        setField(term425, term425.getClass(), "rebootStartTime", "HyxfbSQYBe");
        setField(term425, term425.getClass(), "rebootEndTime", "pCTimMblYc");
        setIntField(term425, term425.getClass(), "movieUploadLimit", -883034806);
        setIntField(term425, term425.getClass(), "movieStatus", 1585847225);
        setField(term425, term425.getClass(), "movieServerUri", "hNxWaHcfhY");
        setField(term425, term425.getClass(), "deliverServerUri", "RkybSrpybU");
        setField(term425, term425.getClass(), "oldServerUri", "xOEqzGAmDU");
        setField(term425, term425.getClass(), "usbDlServerUri", "eZFUvlxvGV");
        setIntField(term425, term425.getClass(), "rebootInterval", 597278769);
        setField(term423, term423.getClass(), "gameSetting", term425);
        term503 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term503, term503.getClass(), "isMaintenance", true);
        setIntField(term503, term503.getClass(), "requestInterval", -1685132342);
        setField(term503, term503.getClass(), "rebootStartTime", "BYqFIqCKAV");
        setField(term503, term503.getClass(), "rebootEndTime", "vrQLuWIDJX");
        setIntField(term503, term503.getClass(), "movieUploadLimit", -1456670397);
        setIntField(term503, term503.getClass(), "movieStatus", 1622346318);
        setField(term503, term503.getClass(), "movieServerUri", "flxyYxBRtu");
        setField(term503, term503.getClass(), "deliverServerUri", "OclPbYPkcH");
        setField(term503, term503.getClass(), "oldServerUri", "IoAlmYsBwc");
        setField(term503, term503.getClass(), "usbDlServerUri", "TEParAifyi");
        setIntField(term503, term503.getClass(), "rebootInterval", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Object[] args = new Object[1];
        args[0] = term503;
        callMethod(klass, "setGameSetting", argTypes, term423, args);
    }

};


