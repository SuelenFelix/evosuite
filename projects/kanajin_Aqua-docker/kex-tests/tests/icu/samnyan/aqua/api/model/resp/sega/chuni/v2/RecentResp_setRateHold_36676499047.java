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

public class RecentResp_setRateHold_36676499047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48673;
     Object term48725;

    public RecentResp_setRateHold_36676499047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48673 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48679 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48689 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48675, term48675.getClass(), "year", 2012);
        setShortField(term48675, term48675.getClass(), "month", (short) 12);
        setShortField(term48675, term48675.getClass(), "day", (short) 5);
        setField(term48674, term48674.getClass(), "date", term48675);
        setByteField(term48679, term48679.getClass(), "hour", (byte) 23);
        setByteField(term48679, term48679.getClass(), "minute", (byte) 26);
        setByteField(term48679, term48679.getClass(), "second", (byte) 26);
        setIntField(term48679, term48679.getClass(), "nano", 226998623);
        setField(term48674, term48674.getClass(), "time", term48679);
        setField(term48673, term48673.getClass(), "playDate", term48674);
        setIntField(term48685, term48685.getClass(), "year", 2020);
        setShortField(term48685, term48685.getClass(), "month", (short) 4);
        setShortField(term48685, term48685.getClass(), "day", (short) 20);
        setField(term48684, term48684.getClass(), "date", term48685);
        setByteField(term48689, term48689.getClass(), "hour", (byte) 6);
        setByteField(term48689, term48689.getClass(), "minute", (byte) 10);
        setByteField(term48689, term48689.getClass(), "second", (byte) 52);
        setIntField(term48689, term48689.getClass(), "nano", 872227966);
        setField(term48684, term48684.getClass(), "time", term48689);
        setField(term48673, term48673.getClass(), "userPlayDate", term48684);
        setIntField(term48673, term48673.getClass(), "musicId", -724930680);
        setIntField(term48673, term48673.getClass(), "level", -1859413089);
        setIntField(term48673, term48673.getClass(), "customId", -288823387);
        setIntField(term48673, term48673.getClass(), "playedCustom1", 1565022809);
        setIntField(term48673, term48673.getClass(), "playedCustom2", 286088345);
        setIntField(term48673, term48673.getClass(), "playedCustom3", -1958895309);
        setIntField(term48673, term48673.getClass(), "track", -639022235);
        setIntField(term48673, term48673.getClass(), "score", -1063872965);
        setIntField(term48673, term48673.getClass(), "rank", 804907633);
        setIntField(term48673, term48673.getClass(), "maxCombo", -937521678);
        setIntField(term48673, term48673.getClass(), "maxChain", 194707851);
        setIntField(term48673, term48673.getClass(), "rateTap", 806877632);
        setIntField(term48673, term48673.getClass(), "rateHold", -1198681384);
        setIntField(term48673, term48673.getClass(), "rateSlide", 1224777627);
        setIntField(term48673, term48673.getClass(), "rateAir", -1771549367);
        setIntField(term48673, term48673.getClass(), "rateFlick", -83563931);
        setIntField(term48673, term48673.getClass(), "judgeGuilty", 1175147923);
        setIntField(term48673, term48673.getClass(), "judgeAttack", -1424244263);
        setIntField(term48673, term48673.getClass(), "judgeJustice", 808665285);
        setIntField(term48673, term48673.getClass(), "judgeCritical", 2003642877);
        setIntField(term48673, term48673.getClass(), "playerRating", -1574456346);
        setBooleanField(term48673, term48673.getClass(), "isNewRecord", false);
        setBooleanField(term48673, term48673.getClass(), "isFullCombo", false);
        setIntField(term48673, term48673.getClass(), "fullChainKind", 638598511);
        setBooleanField(term48673, term48673.getClass(), "isAllJustice", false);
        setIntField(term48673, term48673.getClass(), "characterId", -946663870);
        setIntField(term48673, term48673.getClass(), "skillId", 1997126409);
        setIntField(term48673, term48673.getClass(), "playKind", 1794793561);
        setBooleanField(term48673, term48673.getClass(), "isClear", false);
        setIntField(term48673, term48673.getClass(), "skillLevel", 1483253425);
        setIntField(term48673, term48673.getClass(), "skillEffect", -1101871231);
        term48725 = new Integer(928527949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48725;
        callMethod(klass, "setRateHold", argTypes, term48673, args);
    }

};


