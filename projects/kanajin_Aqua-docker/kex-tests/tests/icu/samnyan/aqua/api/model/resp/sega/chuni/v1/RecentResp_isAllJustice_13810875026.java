package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_isAllJustice_13810875026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52707;

    public RecentResp_isAllJustice_13810875026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52707 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52723 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52709, term52709.getClass(), "year", 2023);
        setShortField(term52709, term52709.getClass(), "month", (short) 8);
        setShortField(term52709, term52709.getClass(), "day", (short) 30);
        setField(term52708, term52708.getClass(), "date", term52709);
        setByteField(term52713, term52713.getClass(), "hour", (byte) 6);
        setByteField(term52713, term52713.getClass(), "minute", (byte) 55);
        setByteField(term52713, term52713.getClass(), "second", (byte) 45);
        setIntField(term52713, term52713.getClass(), "nano", 174033);
        setField(term52708, term52708.getClass(), "time", term52713);
        setField(term52707, term52707.getClass(), "playDate", term52708);
        setIntField(term52719, term52719.getClass(), "year", 2017);
        setShortField(term52719, term52719.getClass(), "month", (short) 3);
        setShortField(term52719, term52719.getClass(), "day", (short) 13);
        setField(term52718, term52718.getClass(), "date", term52719);
        setByteField(term52723, term52723.getClass(), "hour", (byte) 20);
        setByteField(term52723, term52723.getClass(), "minute", (byte) 41);
        setByteField(term52723, term52723.getClass(), "second", (byte) 9);
        setIntField(term52723, term52723.getClass(), "nano", 698449623);
        setField(term52718, term52718.getClass(), "time", term52723);
        setField(term52707, term52707.getClass(), "userPlayDate", term52718);
        setIntField(term52707, term52707.getClass(), "musicId", -74980095);
        setIntField(term52707, term52707.getClass(), "level", -1303503886);
        setIntField(term52707, term52707.getClass(), "customId", -199463835);
        setIntField(term52707, term52707.getClass(), "playedCustom1", 847764025);
        setIntField(term52707, term52707.getClass(), "playedCustom2", 436004216);
        setIntField(term52707, term52707.getClass(), "playedCustom3", 1327592820);
        setIntField(term52707, term52707.getClass(), "track", 1056183374);
        setIntField(term52707, term52707.getClass(), "score", 908916188);
        setIntField(term52707, term52707.getClass(), "rank", -2066943126);
        setIntField(term52707, term52707.getClass(), "maxCombo", 670556171);
        setIntField(term52707, term52707.getClass(), "maxChain", -1727494705);
        setIntField(term52707, term52707.getClass(), "rateTap", -1168439000);
        setIntField(term52707, term52707.getClass(), "rateHold", -1552818345);
        setIntField(term52707, term52707.getClass(), "rateSlide", -811708149);
        setIntField(term52707, term52707.getClass(), "rateAir", 2060766727);
        setIntField(term52707, term52707.getClass(), "rateFlick", 1298229635);
        setIntField(term52707, term52707.getClass(), "judgeGuilty", -569196422);
        setIntField(term52707, term52707.getClass(), "judgeAttack", -394638810);
        setIntField(term52707, term52707.getClass(), "judgeJustice", 790706322);
        setIntField(term52707, term52707.getClass(), "judgeCritical", 699712077);
        setIntField(term52707, term52707.getClass(), "playerRating", -97640679);
        setBooleanField(term52707, term52707.getClass(), "isNewRecord", true);
        setBooleanField(term52707, term52707.getClass(), "isFullCombo", false);
        setIntField(term52707, term52707.getClass(), "fullChainKind", 1484085042);
        setBooleanField(term52707, term52707.getClass(), "isAllJustice", true);
        setIntField(term52707, term52707.getClass(), "characterId", 1777726456);
        setIntField(term52707, term52707.getClass(), "skillId", -1376824764);
        setIntField(term52707, term52707.getClass(), "playKind", -1173622754);
        setBooleanField(term52707, term52707.getClass(), "isClear", false);
        setIntField(term52707, term52707.getClass(), "skillLevel", -654564305);
        setIntField(term52707, term52707.getClass(), "skillEffect", -1985017499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllJustice", argTypes, term52707, args);
    }

};


