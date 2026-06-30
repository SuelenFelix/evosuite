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

public class RecentResp_getRateTap_211320628113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52031;

    public RecentResp_getRateTap_211320628113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52031 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52047 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52033, term52033.getClass(), "year", 2019);
        setShortField(term52033, term52033.getClass(), "month", (short) 10);
        setShortField(term52033, term52033.getClass(), "day", (short) 4);
        setField(term52032, term52032.getClass(), "date", term52033);
        setByteField(term52037, term52037.getClass(), "hour", (byte) 14);
        setByteField(term52037, term52037.getClass(), "minute", (byte) 11);
        setByteField(term52037, term52037.getClass(), "second", (byte) 28);
        setIntField(term52037, term52037.getClass(), "nano", 963604727);
        setField(term52032, term52032.getClass(), "time", term52037);
        setField(term52031, term52031.getClass(), "playDate", term52032);
        setIntField(term52043, term52043.getClass(), "year", 2029);
        setShortField(term52043, term52043.getClass(), "month", (short) 8);
        setShortField(term52043, term52043.getClass(), "day", (short) 18);
        setField(term52042, term52042.getClass(), "date", term52043);
        setByteField(term52047, term52047.getClass(), "hour", (byte) 8);
        setByteField(term52047, term52047.getClass(), "minute", (byte) 52);
        setByteField(term52047, term52047.getClass(), "second", (byte) 59);
        setIntField(term52047, term52047.getClass(), "nano", 526040172);
        setField(term52042, term52042.getClass(), "time", term52047);
        setField(term52031, term52031.getClass(), "userPlayDate", term52042);
        setIntField(term52031, term52031.getClass(), "musicId", -1320712215);
        setIntField(term52031, term52031.getClass(), "level", -619414497);
        setIntField(term52031, term52031.getClass(), "customId", 1414603242);
        setIntField(term52031, term52031.getClass(), "playedCustom1", 18596324);
        setIntField(term52031, term52031.getClass(), "playedCustom2", 907968883);
        setIntField(term52031, term52031.getClass(), "playedCustom3", -1191329679);
        setIntField(term52031, term52031.getClass(), "track", -937626498);
        setIntField(term52031, term52031.getClass(), "score", 398974629);
        setIntField(term52031, term52031.getClass(), "rank", -790946306);
        setIntField(term52031, term52031.getClass(), "maxCombo", -189980304);
        setIntField(term52031, term52031.getClass(), "maxChain", 1492044959);
        setIntField(term52031, term52031.getClass(), "rateTap", 260483962);
        setIntField(term52031, term52031.getClass(), "rateHold", 1115251191);
        setIntField(term52031, term52031.getClass(), "rateSlide", 1882224203);
        setIntField(term52031, term52031.getClass(), "rateAir", 1320826206);
        setIntField(term52031, term52031.getClass(), "rateFlick", -933702401);
        setIntField(term52031, term52031.getClass(), "judgeGuilty", 1670477259);
        setIntField(term52031, term52031.getClass(), "judgeAttack", 186917839);
        setIntField(term52031, term52031.getClass(), "judgeJustice", 1727889509);
        setIntField(term52031, term52031.getClass(), "judgeCritical", -159961860);
        setIntField(term52031, term52031.getClass(), "playerRating", -1656685141);
        setBooleanField(term52031, term52031.getClass(), "isNewRecord", true);
        setBooleanField(term52031, term52031.getClass(), "isFullCombo", false);
        setIntField(term52031, term52031.getClass(), "fullChainKind", -1550347560);
        setBooleanField(term52031, term52031.getClass(), "isAllJustice", false);
        setIntField(term52031, term52031.getClass(), "characterId", 1130655068);
        setIntField(term52031, term52031.getClass(), "skillId", 1747437566);
        setIntField(term52031, term52031.getClass(), "playKind", -1175737970);
        setBooleanField(term52031, term52031.getClass(), "isClear", false);
        setIntField(term52031, term52031.getClass(), "skillLevel", 891165187);
        setIntField(term52031, term52031.getClass(), "skillEffect", 1608737678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateTap", argTypes, term52031, args);
    }

};


