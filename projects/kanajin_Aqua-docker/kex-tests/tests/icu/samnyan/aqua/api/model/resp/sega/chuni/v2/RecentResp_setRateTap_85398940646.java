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

public class RecentResp_setRateTap_85398940646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48619;
     Object term48671;

    public RecentResp_setRateTap_85398940646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48619 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48635 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48621, term48621.getClass(), "year", 2012);
        setShortField(term48621, term48621.getClass(), "month", (short) 7);
        setShortField(term48621, term48621.getClass(), "day", (short) 23);
        setField(term48620, term48620.getClass(), "date", term48621);
        setByteField(term48625, term48625.getClass(), "hour", (byte) 8);
        setByteField(term48625, term48625.getClass(), "minute", (byte) 33);
        setByteField(term48625, term48625.getClass(), "second", (byte) 50);
        setIntField(term48625, term48625.getClass(), "nano", 663997596);
        setField(term48620, term48620.getClass(), "time", term48625);
        setField(term48619, term48619.getClass(), "playDate", term48620);
        setIntField(term48631, term48631.getClass(), "year", 2018);
        setShortField(term48631, term48631.getClass(), "month", (short) 5);
        setShortField(term48631, term48631.getClass(), "day", (short) 18);
        setField(term48630, term48630.getClass(), "date", term48631);
        setByteField(term48635, term48635.getClass(), "hour", (byte) 22);
        setByteField(term48635, term48635.getClass(), "minute", (byte) 7);
        setByteField(term48635, term48635.getClass(), "second", (byte) 58);
        setIntField(term48635, term48635.getClass(), "nano", 802311880);
        setField(term48630, term48630.getClass(), "time", term48635);
        setField(term48619, term48619.getClass(), "userPlayDate", term48630);
        setIntField(term48619, term48619.getClass(), "musicId", -1303503886);
        setIntField(term48619, term48619.getClass(), "level", -199463835);
        setIntField(term48619, term48619.getClass(), "customId", 847764025);
        setIntField(term48619, term48619.getClass(), "playedCustom1", 436004216);
        setIntField(term48619, term48619.getClass(), "playedCustom2", 1327592820);
        setIntField(term48619, term48619.getClass(), "playedCustom3", 1056183374);
        setIntField(term48619, term48619.getClass(), "track", 908916188);
        setIntField(term48619, term48619.getClass(), "score", -2066943126);
        setIntField(term48619, term48619.getClass(), "rank", 670556171);
        setIntField(term48619, term48619.getClass(), "maxCombo", -1727494705);
        setIntField(term48619, term48619.getClass(), "maxChain", -1168439000);
        setIntField(term48619, term48619.getClass(), "rateTap", -1552818345);
        setIntField(term48619, term48619.getClass(), "rateHold", -811708149);
        setIntField(term48619, term48619.getClass(), "rateSlide", 2060766727);
        setIntField(term48619, term48619.getClass(), "rateAir", 1298229635);
        setIntField(term48619, term48619.getClass(), "rateFlick", -569196422);
        setIntField(term48619, term48619.getClass(), "judgeGuilty", -394638810);
        setIntField(term48619, term48619.getClass(), "judgeAttack", 790706322);
        setIntField(term48619, term48619.getClass(), "judgeJustice", 699712077);
        setIntField(term48619, term48619.getClass(), "judgeCritical", -97640679);
        setIntField(term48619, term48619.getClass(), "playerRating", 1484085042);
        setBooleanField(term48619, term48619.getClass(), "isNewRecord", false);
        setBooleanField(term48619, term48619.getClass(), "isFullCombo", false);
        setIntField(term48619, term48619.getClass(), "fullChainKind", 1777726456);
        setBooleanField(term48619, term48619.getClass(), "isAllJustice", false);
        setIntField(term48619, term48619.getClass(), "characterId", -1376824764);
        setIntField(term48619, term48619.getClass(), "skillId", -1173622754);
        setIntField(term48619, term48619.getClass(), "playKind", -654564305);
        setBooleanField(term48619, term48619.getClass(), "isClear", false);
        setIntField(term48619, term48619.getClass(), "skillLevel", -1985017499);
        setIntField(term48619, term48619.getClass(), "skillEffect", 1959598890);
        term48671 = new Integer(-920963609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48671;
        callMethod(klass, "setRateTap", argTypes, term48619, args);
    }

};


