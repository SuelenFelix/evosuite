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

public class RecentResp_setJudgeAttack_58826162952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54113;
     Object term54165;

    public RecentResp_setJudgeAttack_58826162952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54113 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54115 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54119 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54129 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54115, term54115.getClass(), "year", 2014);
        setShortField(term54115, term54115.getClass(), "month", (short) 11);
        setShortField(term54115, term54115.getClass(), "day", (short) 30);
        setField(term54114, term54114.getClass(), "date", term54115);
        setByteField(term54119, term54119.getClass(), "hour", (byte) 19);
        setByteField(term54119, term54119.getClass(), "minute", (byte) 38);
        setByteField(term54119, term54119.getClass(), "second", (byte) 52);
        setIntField(term54119, term54119.getClass(), "nano", 246326841);
        setField(term54114, term54114.getClass(), "time", term54119);
        setField(term54113, term54113.getClass(), "playDate", term54114);
        setIntField(term54125, term54125.getClass(), "year", 2028);
        setShortField(term54125, term54125.getClass(), "month", (short) 5);
        setShortField(term54125, term54125.getClass(), "day", (short) 3);
        setField(term54124, term54124.getClass(), "date", term54125);
        setByteField(term54129, term54129.getClass(), "hour", (byte) 15);
        setByteField(term54129, term54129.getClass(), "minute", (byte) 33);
        setByteField(term54129, term54129.getClass(), "second", (byte) 14);
        setIntField(term54129, term54129.getClass(), "nano", 322733130);
        setField(term54124, term54124.getClass(), "time", term54129);
        setField(term54113, term54113.getClass(), "userPlayDate", term54124);
        setIntField(term54113, term54113.getClass(), "musicId", -1293074430);
        setIntField(term54113, term54113.getClass(), "level", 608662433);
        setIntField(term54113, term54113.getClass(), "customId", -2015476493);
        setIntField(term54113, term54113.getClass(), "playedCustom1", 41528103);
        setIntField(term54113, term54113.getClass(), "playedCustom2", -1732381818);
        setIntField(term54113, term54113.getClass(), "playedCustom3", 1960614460);
        setIntField(term54113, term54113.getClass(), "track", -1488501179);
        setIntField(term54113, term54113.getClass(), "score", 2086648406);
        setIntField(term54113, term54113.getClass(), "rank", 805890273);
        setIntField(term54113, term54113.getClass(), "maxCombo", 1078863472);
        setIntField(term54113, term54113.getClass(), "maxChain", -1845619952);
        setIntField(term54113, term54113.getClass(), "rateTap", -1363744441);
        setIntField(term54113, term54113.getClass(), "rateHold", -1303828030);
        setIntField(term54113, term54113.getClass(), "rateSlide", 1611629079);
        setIntField(term54113, term54113.getClass(), "rateAir", 770171276);
        setIntField(term54113, term54113.getClass(), "rateFlick", -1497914215);
        setIntField(term54113, term54113.getClass(), "judgeGuilty", 254385018);
        setIntField(term54113, term54113.getClass(), "judgeAttack", 672070228);
        setIntField(term54113, term54113.getClass(), "judgeJustice", 1014463904);
        setIntField(term54113, term54113.getClass(), "judgeCritical", 928673401);
        setIntField(term54113, term54113.getClass(), "playerRating", -631739609);
        setBooleanField(term54113, term54113.getClass(), "isNewRecord", false);
        setBooleanField(term54113, term54113.getClass(), "isFullCombo", true);
        setIntField(term54113, term54113.getClass(), "fullChainKind", -2045566233);
        setBooleanField(term54113, term54113.getClass(), "isAllJustice", true);
        setIntField(term54113, term54113.getClass(), "characterId", 102632361);
        setIntField(term54113, term54113.getClass(), "skillId", -871963633);
        setIntField(term54113, term54113.getClass(), "playKind", -572352492);
        setBooleanField(term54113, term54113.getClass(), "isClear", false);
        setIntField(term54113, term54113.getClass(), "skillLevel", -583361854);
        setIntField(term54113, term54113.getClass(), "skillEffect", 717140857);
        term54165 = new Integer(891889211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54165;
        callMethod(klass, "setJudgeAttack", argTypes, term54113, args);
    }

};


