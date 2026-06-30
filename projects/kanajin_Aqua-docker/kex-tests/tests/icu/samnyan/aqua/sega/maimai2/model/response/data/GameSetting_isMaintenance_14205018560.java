package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_isMaintenance_14205018560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2038;

    public GameSetting_isMaintenance_14205018560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2038 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term2038, term2038.getClass(), "isMaintenance", false);
        setIntField(term2038, term2038.getClass(), "requestInterval", -1030167086);
        setField(term2038, term2038.getClass(), "rebootStartTime", "PtIjKpiSix");
        setField(term2038, term2038.getClass(), "rebootEndTime", "NZdTuwSCIM");
        setIntField(term2038, term2038.getClass(), "movieUploadLimit", -434230943);
        setIntField(term2038, term2038.getClass(), "movieStatus", 698633875);
        setField(term2038, term2038.getClass(), "movieServerUri", "dDHcmzPAmP");
        setField(term2038, term2038.getClass(), "deliverServerUri", "HEaTkWYBgv");
        setField(term2038, term2038.getClass(), "oldServerUri", "MpJsPKLTIU");
        setField(term2038, term2038.getClass(), "usbDlServerUri", "IiNCZfdouL");
        setIntField(term2038, term2038.getClass(), "rebootInterval", 548468113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaintenance", argTypes, term2038, args);
    }

};


