package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getMaxCountMusic_13714983010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4902;

    public GameSetting_getMaxCountMusic_13714983010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4902 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4902, term4902.getClass(), "dataVersion", "iAOFcXaLSf");
        setField(term4902, term4902.getClass(), "onlineDataVersion", "EHoNUaeyvT");
        setBooleanField(term4902, term4902.getClass(), "isMaintenance", false);
        setIntField(term4902, term4902.getClass(), "requestInterval", 1841765799);
        setField(term4902, term4902.getClass(), "rebootStartTime", "ZwKmasCVIy");
        setField(term4902, term4902.getClass(), "rebootEndTime", "pxokrVaeMd");
        setBooleanField(term4902, term4902.getClass(), "isBackgroundDistribute", false);
        setIntField(term4902, term4902.getClass(), "maxCountCharacter", 72160200);
        setIntField(term4902, term4902.getClass(), "maxCountCard", -1870567623);
        setIntField(term4902, term4902.getClass(), "maxCountItem", -1442923471);
        setIntField(term4902, term4902.getClass(), "maxCountMusic", -434247549);
        setIntField(term4902, term4902.getClass(), "maxCountMusicItem", 1246505552);
        setIntField(term4902, term4902.getClass(), "macCountRivalMusic", -1456497810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountMusic", argTypes, term4902, args);
    }

};


