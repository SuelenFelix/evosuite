package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RecentResp_setRateAir_87129605549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48781;
     Object term48833;

    public RecentResp_setRateAir_87129605549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48781 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48797 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48783, term48783.getClass(), "year", 2013);
        setShortField(term48783, term48783.getClass(), "month", (short) 11);
        setShortField(term48783, term48783.getClass(), "day", (short) 15);
        setField(term48782, term48782.getClass(), "date", term48783);
        setByteField(term48787, term48787.getClass(), "hour", (byte) 16);
        setByteField(term48787, term48787.getClass(), "minute", (byte) 0);
        setByteField(term48787, term48787.getClass(), "second", (byte) 59);
        setIntField(term48787, term48787.getClass(), "nano", 823311700);
        setField(term48782, term48782.getClass(), "time", term48787);
        setField(term48781, term48781.getClass(), "playDate", term48782);
        setIntField(term48793, term48793.getClass(), "year", 2017);
        setShortField(term48793, term48793.getClass(), "month", (short) 11);
        setShortField(term48793, term48793.getClass(), "day", (short) 30);
        setField(term48792, term48792.getClass(), "date", term48793);
        setByteField(term48797, term48797.getClass(), "hour", (byte) 23);
        setByteField(term48797, term48797.getClass(), "minute", (byte) 28);
        setByteField(term48797, term48797.getClass(), "second", (byte) 34);
        setIntField(term48797, term48797.getClass(), "nano", 684347789);
        setField(term48792, term48792.getClass(), "time", term48797);
        setField(term48781, term48781.getClass(), "userPlayDate", term48792);
        setIntField(term48781, term48781.getClass(), "musicId", 1917343242);
        setIntField(term48781, term48781.getClass(), "level", 504552083);
        setIntField(term48781, term48781.getClass(), "customId", -714955265);
        setIntField(term48781, term48781.getClass(), "playedCustom1", 1191317081);
        setIntField(term48781, term48781.getClass(), "playedCustom2", -1321805207);
        setIntField(term48781, term48781.getClass(), "playedCustom3", 1827794411);
        setIntField(term48781, term48781.getClass(), "track", -1377700263);
        setIntField(term48781, term48781.getClass(), "score", -38722118);
        setIntField(term48781, term48781.getClass(), "rank", 1123663642);
        setIntField(term48781, term48781.getClass(), "maxCombo", 404156777);
        setIntField(term48781, term48781.getClass(), "maxChain", 74684104);
        setIntField(term48781, term48781.getClass(), "rateTap", 502851553);
        setIntField(term48781, term48781.getClass(), "rateHold", -1149654883);
        setIntField(term48781, term48781.getClass(), "rateSlide", -346017809);
        setIntField(term48781, term48781.getClass(), "rateAir", 1922136769);
        setIntField(term48781, term48781.getClass(), "rateFlick", 1253469190);
        setIntField(term48781, term48781.getClass(), "judgeGuilty", -92568219);
        setIntField(term48781, term48781.getClass(), "judgeAttack", 647226080);
        setIntField(term48781, term48781.getClass(), "judgeJustice", -1031047832);
        setIntField(term48781, term48781.getClass(), "judgeCritical", -1460628462);
        setIntField(term48781, term48781.getClass(), "playerRating", -1466838817);
        setBooleanField(term48781, term48781.getClass(), "isNewRecord", false);
        setBooleanField(term48781, term48781.getClass(), "isFullCombo", false);
        setIntField(term48781, term48781.getClass(), "fullChainKind", -1308667183);
        setBooleanField(term48781, term48781.getClass(), "isAllJustice", false);
        setIntField(term48781, term48781.getClass(), "characterId", -1936073165);
        setIntField(term48781, term48781.getClass(), "skillId", 2145615477);
        setIntField(term48781, term48781.getClass(), "playKind", 1806729907);
        setBooleanField(term48781, term48781.getClass(), "isClear", true);
        setIntField(term48781, term48781.getClass(), "skillLevel", -182792320);
        setIntField(term48781, term48781.getClass(), "skillEffect", 409164749);
        term48833 = new Integer(896581942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48833;
        callMethod(klass, "setRateAir", argTypes, term48781, args);
    }

};


