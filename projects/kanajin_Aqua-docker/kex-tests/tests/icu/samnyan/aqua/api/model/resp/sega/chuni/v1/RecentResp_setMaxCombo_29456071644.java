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
import java.lang.Integer;

public class RecentResp_setMaxCombo_29456071644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53681;
     Object term53733;

    public RecentResp_setMaxCombo_29456071644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53681 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53687 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53697 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53683, term53683.getClass(), "year", 2023);
        setShortField(term53683, term53683.getClass(), "month", (short) 2);
        setShortField(term53683, term53683.getClass(), "day", (short) 24);
        setField(term53682, term53682.getClass(), "date", term53683);
        setByteField(term53687, term53687.getClass(), "hour", (byte) 13);
        setByteField(term53687, term53687.getClass(), "minute", (byte) 14);
        setByteField(term53687, term53687.getClass(), "second", (byte) 25);
        setIntField(term53687, term53687.getClass(), "nano", 73608340);
        setField(term53682, term53682.getClass(), "time", term53687);
        setField(term53681, term53681.getClass(), "playDate", term53682);
        setIntField(term53693, term53693.getClass(), "year", 2015);
        setShortField(term53693, term53693.getClass(), "month", (short) 9);
        setShortField(term53693, term53693.getClass(), "day", (short) 8);
        setField(term53692, term53692.getClass(), "date", term53693);
        setByteField(term53697, term53697.getClass(), "hour", (byte) 8);
        setByteField(term53697, term53697.getClass(), "minute", (byte) 25);
        setByteField(term53697, term53697.getClass(), "second", (byte) 10);
        setIntField(term53697, term53697.getClass(), "nano", 506972016);
        setField(term53692, term53692.getClass(), "time", term53697);
        setField(term53681, term53681.getClass(), "userPlayDate", term53692);
        setIntField(term53681, term53681.getClass(), "musicId", 882866050);
        setIntField(term53681, term53681.getClass(), "level", -979923296);
        setIntField(term53681, term53681.getClass(), "customId", 1294282133);
        setIntField(term53681, term53681.getClass(), "playedCustom1", -1857786332);
        setIntField(term53681, term53681.getClass(), "playedCustom2", 1307491791);
        setIntField(term53681, term53681.getClass(), "playedCustom3", 445813516);
        setIntField(term53681, term53681.getClass(), "track", 180030231);
        setIntField(term53681, term53681.getClass(), "score", 645685543);
        setIntField(term53681, term53681.getClass(), "rank", -704733432);
        setIntField(term53681, term53681.getClass(), "maxCombo", 147233013);
        setIntField(term53681, term53681.getClass(), "maxChain", -828376022);
        setIntField(term53681, term53681.getClass(), "rateTap", -1133227278);
        setIntField(term53681, term53681.getClass(), "rateHold", -1998106900);
        setIntField(term53681, term53681.getClass(), "rateSlide", -1628037152);
        setIntField(term53681, term53681.getClass(), "rateAir", -1550570392);
        setIntField(term53681, term53681.getClass(), "rateFlick", -59951395);
        setIntField(term53681, term53681.getClass(), "judgeGuilty", -294114307);
        setIntField(term53681, term53681.getClass(), "judgeAttack", -745407686);
        setIntField(term53681, term53681.getClass(), "judgeJustice", -1183051462);
        setIntField(term53681, term53681.getClass(), "judgeCritical", -572029073);
        setIntField(term53681, term53681.getClass(), "playerRating", 1348271533);
        setBooleanField(term53681, term53681.getClass(), "isNewRecord", false);
        setBooleanField(term53681, term53681.getClass(), "isFullCombo", true);
        setIntField(term53681, term53681.getClass(), "fullChainKind", 1234771885);
        setBooleanField(term53681, term53681.getClass(), "isAllJustice", false);
        setIntField(term53681, term53681.getClass(), "characterId", 1821658782);
        setIntField(term53681, term53681.getClass(), "skillId", 871613900);
        setIntField(term53681, term53681.getClass(), "playKind", 1322676409);
        setBooleanField(term53681, term53681.getClass(), "isClear", false);
        setIntField(term53681, term53681.getClass(), "skillLevel", -954764876);
        setIntField(term53681, term53681.getClass(), "skillEffect", 1870177323);
        term53733 = new Integer(-1027146644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53733;
        callMethod(klass, "setMaxCombo", argTypes, term53681, args);
    }

};


