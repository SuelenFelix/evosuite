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

public class RecentResp_canEqual_85403731567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54922;
     Object term54974;

    public RecentResp_canEqual_85403731567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54922 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54938 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54924, term54924.getClass(), "year", 2010);
        setShortField(term54924, term54924.getClass(), "month", (short) 8);
        setShortField(term54924, term54924.getClass(), "day", (short) 25);
        setField(term54923, term54923.getClass(), "date", term54924);
        setByteField(term54928, term54928.getClass(), "hour", (byte) 7);
        setByteField(term54928, term54928.getClass(), "minute", (byte) 13);
        setByteField(term54928, term54928.getClass(), "second", (byte) 16);
        setIntField(term54928, term54928.getClass(), "nano", 196716483);
        setField(term54923, term54923.getClass(), "time", term54928);
        setField(term54922, term54922.getClass(), "playDate", term54923);
        setIntField(term54934, term54934.getClass(), "year", 2016);
        setShortField(term54934, term54934.getClass(), "month", (short) 2);
        setShortField(term54934, term54934.getClass(), "day", (short) 19);
        setField(term54933, term54933.getClass(), "date", term54934);
        setByteField(term54938, term54938.getClass(), "hour", (byte) 1);
        setByteField(term54938, term54938.getClass(), "minute", (byte) 32);
        setByteField(term54938, term54938.getClass(), "second", (byte) 43);
        setIntField(term54938, term54938.getClass(), "nano", 671735228);
        setField(term54933, term54933.getClass(), "time", term54938);
        setField(term54922, term54922.getClass(), "userPlayDate", term54933);
        setIntField(term54922, term54922.getClass(), "musicId", -1459222679);
        setIntField(term54922, term54922.getClass(), "level", 91387193);
        setIntField(term54922, term54922.getClass(), "customId", -457093173);
        setIntField(term54922, term54922.getClass(), "playedCustom1", -738503746);
        setIntField(term54922, term54922.getClass(), "playedCustom2", 1118865267);
        setIntField(term54922, term54922.getClass(), "playedCustom3", 1899392740);
        setIntField(term54922, term54922.getClass(), "track", 144291847);
        setIntField(term54922, term54922.getClass(), "score", 263154490);
        setIntField(term54922, term54922.getClass(), "rank", 1685033038);
        setIntField(term54922, term54922.getClass(), "maxCombo", 1455872685);
        setIntField(term54922, term54922.getClass(), "maxChain", -895803070);
        setIntField(term54922, term54922.getClass(), "rateTap", -2065313027);
        setIntField(term54922, term54922.getClass(), "rateHold", 394881188);
        setIntField(term54922, term54922.getClass(), "rateSlide", 2114133243);
        setIntField(term54922, term54922.getClass(), "rateAir", -1108430202);
        setIntField(term54922, term54922.getClass(), "rateFlick", 972569482);
        setIntField(term54922, term54922.getClass(), "judgeGuilty", -924513639);
        setIntField(term54922, term54922.getClass(), "judgeAttack", -1763498118);
        setIntField(term54922, term54922.getClass(), "judgeJustice", -1084106934);
        setIntField(term54922, term54922.getClass(), "judgeCritical", -1137769039);
        setIntField(term54922, term54922.getClass(), "playerRating", 753769464);
        setBooleanField(term54922, term54922.getClass(), "isNewRecord", true);
        setBooleanField(term54922, term54922.getClass(), "isFullCombo", true);
        setIntField(term54922, term54922.getClass(), "fullChainKind", -2025824446);
        setBooleanField(term54922, term54922.getClass(), "isAllJustice", false);
        setIntField(term54922, term54922.getClass(), "characterId", -203123521);
        setIntField(term54922, term54922.getClass(), "skillId", 2107969370);
        setIntField(term54922, term54922.getClass(), "playKind", -1606896209);
        setBooleanField(term54922, term54922.getClass(), "isClear", true);
        setIntField(term54922, term54922.getClass(), "skillLevel", 1824801079);
        setIntField(term54922, term54922.getClass(), "skillEffect", 1191665770);
        term54974 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54974;
        callMethod(klass, "canEqual", argTypes, term54922, args);
    }

};


