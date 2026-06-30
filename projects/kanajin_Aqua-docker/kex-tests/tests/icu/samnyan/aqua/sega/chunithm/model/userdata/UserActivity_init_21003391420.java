package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserActivity_init_21003391420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291407;

    public UserActivity_init_21003391420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term291411 = new Long(-5338413783740215067L);
        term291407 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term291409 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term291425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term291435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term291457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term291518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term291566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term291612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291617 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term291407, term291407.getClass(), "id", -6525339099981396474L);
        setLongField(term291409, term291409.getClass(), "id", 8717114834059748754L);
        setField(term291409, term291409.getClass(), "extId", term291411);
        setField(term291409, term291409.getClass(), "luid", "JrRvLrAvOe");
        setIntField(term291426, term291426.getClass(), "year", 2014);
        setShortField(term291426, term291426.getClass(), "month", (short) 12);
        setShortField(term291426, term291426.getClass(), "day", (short) 16);
        setField(term291425, term291425.getClass(), "date", term291426);
        setByteField(term291430, term291430.getClass(), "hour", (byte) 16);
        setByteField(term291430, term291430.getClass(), "minute", (byte) 51);
        setByteField(term291430, term291430.getClass(), "second", (byte) 51);
        setIntField(term291430, term291430.getClass(), "nano", 64221119);
        setField(term291425, term291425.getClass(), "time", term291430);
        setField(term291409, term291409.getClass(), "registerTime", term291425);
        setIntField(term291436, term291436.getClass(), "year", 2022);
        setShortField(term291436, term291436.getClass(), "month", (short) 8);
        setShortField(term291436, term291436.getClass(), "day", (short) 21);
        setField(term291435, term291435.getClass(), "date", term291436);
        setByteField(term291440, term291440.getClass(), "hour", (byte) 18);
        setByteField(term291440, term291440.getClass(), "minute", (byte) 48);
        setByteField(term291440, term291440.getClass(), "second", (byte) 13);
        setIntField(term291440, term291440.getClass(), "nano", 744191480);
        setField(term291435, term291435.getClass(), "time", term291440);
        setField(term291409, term291409.getClass(), "accessTime", term291435);
        setField(term291407, term291407.getClass(), "card", term291409);
        setField(term291407, term291407.getClass(), "userName", "PKoYIuVvCK");
        setIntField(term291458, term291458.getClass(), "year", 2023);
        setShortField(term291458, term291458.getClass(), "month", (short) 5);
        setShortField(term291458, term291458.getClass(), "day", (short) 26);
        setField(term291457, term291457.getClass(), "date", term291458);
        setByteField(term291462, term291462.getClass(), "hour", (byte) 8);
        setByteField(term291462, term291462.getClass(), "minute", (byte) 7);
        setByteField(term291462, term291462.getClass(), "second", (byte) 59);
        setIntField(term291462, term291462.getClass(), "nano", 58270816);
        setField(term291457, term291457.getClass(), "time", term291462);
        setField(term291407, term291407.getClass(), "lastLoginDate", term291457);
        setBooleanField(term291407, term291407.getClass(), "isWebJoin", true);
        setField(term291407, term291407.getClass(), "webLimitDate", "cwzXkcrDLR");
        setIntField(term291407, term291407.getClass(), "level", 916435001);
        setIntField(term291407, term291407.getClass(), "reincarnationNum", 589036561);
        setField(term291407, term291407.getClass(), "exp", "PWbkTRRQhH");
        setLongField(term291407, term291407.getClass(), "point", -1286664203066051015L);
        setLongField(term291407, term291407.getClass(), "totalPoint", -6988326223564223966L);
        setIntField(term291407, term291407.getClass(), "playCount", 272900436);
        setIntField(term291407, term291407.getClass(), "multiPlayCount", -514490601);
        setIntField(term291407, term291407.getClass(), "multiWinCount", -1010178423);
        setIntField(term291407, term291407.getClass(), "requestResCount", 938778978);
        setIntField(term291407, term291407.getClass(), "acceptResCount", -1314147994);
        setIntField(term291407, term291407.getClass(), "successResCount", -1120741921);
        setIntField(term291407, term291407.getClass(), "playerRating", 1584813896);
        setIntField(term291407, term291407.getClass(), "highestRating", 678376088);
        setIntField(term291407, term291407.getClass(), "nameplateId", -1372919168);
        setIntField(term291407, term291407.getClass(), "frameId", -1947772440);
        setIntField(term291407, term291407.getClass(), "characterId", -1418556051);
        setIntField(term291407, term291407.getClass(), "trophyId", -336128698);
        setIntField(term291407, term291407.getClass(), "playedTutorialBit", 125498217);
        setIntField(term291407, term291407.getClass(), "firstTutorialCancelNum", 1952902014);
        setIntField(term291407, term291407.getClass(), "masterTutorialCancelNum", -1288918594);
        setIntField(term291407, term291407.getClass(), "totalRepertoireCount", 1636943183);
        setIntField(term291407, term291407.getClass(), "totalMapNum", 342127359);
        setLongField(term291407, term291407.getClass(), "totalHiScore", 1481002182512184986L);
        setLongField(term291407, term291407.getClass(), "totalBasicHighScore", 25777508728098735L);
        setLongField(term291407, term291407.getClass(), "totalAdvancedHighScore", -5537421233963863439L);
        setLongField(term291407, term291407.getClass(), "totalExpertHighScore", -7776455266794736508L);
        setLongField(term291407, term291407.getClass(), "totalMasterHighScore", 1859486651056014320L);
        setIntField(term291519, term291519.getClass(), "year", 2020);
        setShortField(term291519, term291519.getClass(), "month", (short) 5);
        setShortField(term291519, term291519.getClass(), "day", (short) 12);
        setField(term291518, term291518.getClass(), "date", term291519);
        setByteField(term291523, term291523.getClass(), "hour", (byte) 20);
        setByteField(term291523, term291523.getClass(), "minute", (byte) 33);
        setByteField(term291523, term291523.getClass(), "second", (byte) 25);
        setIntField(term291523, term291523.getClass(), "nano", 469866785);
        setField(term291518, term291518.getClass(), "time", term291523);
        setField(term291407, term291407.getClass(), "eventWatchedDate", term291518);
        setIntField(term291407, term291407.getClass(), "friendCount", 539999937);
        setBooleanField(term291407, term291407.getClass(), "isMaimai", false);
        setField(term291407, term291407.getClass(), "firstGameId", "wAITmXtDRl");
        setField(term291407, term291407.getClass(), "firstRomVersion", "CftrpNyoIA");
        setField(term291407, term291407.getClass(), "firstDataVersion", "uPzBpshCha");
        setIntField(term291567, term291567.getClass(), "year", 2015);
        setShortField(term291567, term291567.getClass(), "month", (short) 2);
        setShortField(term291567, term291567.getClass(), "day", (short) 23);
        setField(term291566, term291566.getClass(), "date", term291567);
        setByteField(term291571, term291571.getClass(), "hour", (byte) 2);
        setByteField(term291571, term291571.getClass(), "minute", (byte) 54);
        setByteField(term291571, term291571.getClass(), "second", (byte) 24);
        setIntField(term291571, term291571.getClass(), "nano", 374519724);
        setField(term291566, term291566.getClass(), "time", term291571);
        setField(term291407, term291407.getClass(), "firstPlayDate", term291566);
        setField(term291407, term291407.getClass(), "lastGameId", "hEJfxgmgVV");
        setField(term291407, term291407.getClass(), "lastRomVersion", "eVLVFZDIBz");
        setField(term291407, term291407.getClass(), "lastDataVersion", "XMRXETuILP");
        setIntField(term291613, term291613.getClass(), "year", 2021);
        setShortField(term291613, term291613.getClass(), "month", (short) 8);
        setShortField(term291613, term291613.getClass(), "day", (short) 30);
        setField(term291612, term291612.getClass(), "date", term291613);
        setByteField(term291617, term291617.getClass(), "hour", (byte) 6);
        setByteField(term291617, term291617.getClass(), "minute", (byte) 44);
        setByteField(term291617, term291617.getClass(), "second", (byte) 2);
        setIntField(term291617, term291617.getClass(), "nano", 297235844);
        setField(term291612, term291612.getClass(), "time", term291617);
        setField(term291407, term291407.getClass(), "lastPlayDate", term291612);
        setIntField(term291407, term291407.getClass(), "lastPlaceId", 310856051);
        setField(term291407, term291407.getClass(), "lastPlaceName", "DMmgjHjqVC");
        setField(term291407, term291407.getClass(), "lastRegionId", "wYIvugRJpW");
        setField(term291407, term291407.getClass(), "lastRegionName", "DRgRlMubyd");
        setField(term291407, term291407.getClass(), "lastAllNetId", "IuKHVDtAZk");
        setField(term291407, term291407.getClass(), "lastClientId", "HmynvbqVMU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term291407;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


