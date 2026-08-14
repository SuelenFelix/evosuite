package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setLastPlaceId_2115681192107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256333;
     Object term256694;

    public UserDetail_setLastPlaceId_2115681192107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term256337 = new Long(-4693900822622913579L);
        Integer term256400 = new Integer(-143522206);
        Integer term256402 = new Integer(70726858);
        ArrayList term256398 = new ArrayList();
        ((ArrayList) term256398).add(term256400);
        ((ArrayList) term256398).add(term256402);
        Integer term256408 = new Integer(-1883665560);
        Integer term256410 = new Integer(-1304361419);
        Integer term256412 = new Integer(-1253063552);
        Integer term256414 = new Integer(11874750);
        Integer term256416 = new Integer(-920088882);
        Integer term256418 = new Integer(-1963888580);
        Integer term256420 = new Integer(885969140);
        Integer term256422 = new Integer(-573115224);
        Integer term256424 = new Integer(716083613);
        ArrayList term256406 = new ArrayList();
        ((ArrayList) term256406).add(term256408);
        ((ArrayList) term256406).add(term256410);
        ((ArrayList) term256406).add(term256412);
        ((ArrayList) term256406).add(term256414);
        ((ArrayList) term256406).add(term256416);
        ((ArrayList) term256406).add(term256418);
        ((ArrayList) term256406).add(term256420);
        ((ArrayList) term256406).add(term256422);
        ((ArrayList) term256406).add(term256424);
        term256333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term256335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term256351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term256333, term256333.getClass(), "id", -5944828074932692757L);
        setLongField(term256335, term256335.getClass(), "id", 5678707623297394450L);
        setField(term256335, term256335.getClass(), "extId", term256337);
        setField(term256335, term256335.getClass(), "luid", "keaFywfzbU");
        setIntField(term256352, term256352.getClass(), "year", 2023);
        setShortField(term256352, term256352.getClass(), "month", (short) 3);
        setShortField(term256352, term256352.getClass(), "day", (short) 15);
        setField(term256351, term256351.getClass(), "date", term256352);
        setByteField(term256356, term256356.getClass(), "hour", (byte) 9);
        setByteField(term256356, term256356.getClass(), "minute", (byte) 10);
        setByteField(term256356, term256356.getClass(), "second", (byte) 38);
        setIntField(term256356, term256356.getClass(), "nano", 695302180);
        setField(term256351, term256351.getClass(), "time", term256356);
        setField(term256335, term256335.getClass(), "registerTime", term256351);
        setIntField(term256362, term256362.getClass(), "year", 2019);
        setShortField(term256362, term256362.getClass(), "month", (short) 12);
        setShortField(term256362, term256362.getClass(), "day", (short) 29);
        setField(term256361, term256361.getClass(), "date", term256362);
        setByteField(term256366, term256366.getClass(), "hour", (byte) 19);
        setByteField(term256366, term256366.getClass(), "minute", (byte) 43);
        setByteField(term256366, term256366.getClass(), "second", (byte) 47);
        setIntField(term256366, term256366.getClass(), "nano", 957440346);
        setField(term256361, term256361.getClass(), "time", term256366);
        setField(term256335, term256335.getClass(), "accessTime", term256361);
        setField(term256333, term256333.getClass(), "card", term256335);
        setField(term256333, term256333.getClass(), "userName", "ADlubZpgSu");
        setIntField(term256333, term256333.getClass(), "isNetMember", 1038645253);
        setIntField(term256333, term256333.getClass(), "iconId", 1874684683);
        setIntField(term256333, term256333.getClass(), "plateId", -65922279);
        setIntField(term256333, term256333.getClass(), "titleId", -248288256);
        setIntField(term256333, term256333.getClass(), "partnerId", -2041452525);
        setIntField(term256333, term256333.getClass(), "frameId", 1983098908);
        setIntField(term256333, term256333.getClass(), "selectMapId", 301824784);
        setIntField(term256333, term256333.getClass(), "totalAwake", 857558066);
        setIntField(term256333, term256333.getClass(), "gradeRating", -6342723);
        setIntField(term256333, term256333.getClass(), "musicRating", 1756918414);
        setIntField(term256333, term256333.getClass(), "playerRating", 608595543);
        setIntField(term256333, term256333.getClass(), "highestRating", 1398716212);
        setIntField(term256333, term256333.getClass(), "gradeRank", -1480289183);
        setIntField(term256333, term256333.getClass(), "classRank", -1549445595);
        setIntField(term256333, term256333.getClass(), "courseRank", -489905003);
        setField(term256333, term256333.getClass(), "charaSlot", term256398);
        setField(term256333, term256333.getClass(), "charaLockSlot", term256406);
        setLongField(term256333, term256333.getClass(), "contentBit", 832340031179054078L);
        setIntField(term256333, term256333.getClass(), "playCount", 734985387);
        setField(term256333, term256333.getClass(), "eventWatchedDate", "MzSJDcOtLM");
        setField(term256333, term256333.getClass(), "lastGameId", "GsuZHmLIYX");
        setField(term256333, term256333.getClass(), "lastRomVersion", "UnZGDLrFWQ");
        setField(term256333, term256333.getClass(), "lastDataVersion", "zKUSldypzp");
        setField(term256333, term256333.getClass(), "lastLoginDate", "DZyNInpLTr");
        setField(term256333, term256333.getClass(), "lastPlayDate", "RPeGSfMGcA");
        setIntField(term256333, term256333.getClass(), "lastPlayCredit", -1589839648);
        setIntField(term256333, term256333.getClass(), "lastPlayMode", 797967545);
        setIntField(term256333, term256333.getClass(), "lastPlaceId", 1752785510);
        setField(term256333, term256333.getClass(), "lastPlaceName", "dhopMnOrLY");
        setIntField(term256333, term256333.getClass(), "lastAllNetId", -2139567650);
        setIntField(term256333, term256333.getClass(), "lastRegionId", 1941649114);
        setField(term256333, term256333.getClass(), "lastRegionName", "wsnRKetsGI");
        setField(term256333, term256333.getClass(), "lastClientId", "QLytkOkJsd");
        setField(term256333, term256333.getClass(), "lastCountryCode", "CExchqIigF");
        setIntField(term256333, term256333.getClass(), "lastSelectEMoney", -287321760);
        setIntField(term256333, term256333.getClass(), "lastSelectTicket", -1313321034);
        setIntField(term256333, term256333.getClass(), "lastSelectCourse", 131693432);
        setIntField(term256333, term256333.getClass(), "lastCountCourse", -884613349);
        setField(term256333, term256333.getClass(), "firstGameId", "fNWyHowvJR");
        setField(term256333, term256333.getClass(), "firstRomVersion", "synCfIOSuZ");
        setField(term256333, term256333.getClass(), "firstDataVersion", "nYiDbDJWoP");
        setField(term256333, term256333.getClass(), "firstPlayDate", "dytNsIZeKc");
        setField(term256333, term256333.getClass(), "compatibleCmVersion", "VVfxhVBDZu");
        setField(term256333, term256333.getClass(), "dailyBonusDate", "eeNpiPOYFc");
        setField(term256333, term256333.getClass(), "dailyCourseBonusDate", "ERUptLbOom");
        setField(term256333, term256333.getClass(), "lastPairLoginDate", "bBEslIUoPI");
        setField(term256333, term256333.getClass(), "lastTrialPlayDate", "YDRVeGkKiv");
        setIntField(term256333, term256333.getClass(), "playVsCount", -227022389);
        setIntField(term256333, term256333.getClass(), "playSyncCount", -780249262);
        setIntField(term256333, term256333.getClass(), "winCount", -1608693876);
        setIntField(term256333, term256333.getClass(), "helpCount", 1682226516);
        setIntField(term256333, term256333.getClass(), "comboCount", 982039024);
        setLongField(term256333, term256333.getClass(), "totalDeluxscore", 434148518094474889L);
        setLongField(term256333, term256333.getClass(), "totalBasicDeluxscore", 5822613783527086891L);
        setLongField(term256333, term256333.getClass(), "totalAdvancedDeluxscore", -856877156735058691L);
        setLongField(term256333, term256333.getClass(), "totalExpertDeluxscore", 7031867735081003144L);
        setLongField(term256333, term256333.getClass(), "totalMasterDeluxscore", 869924788078913714L);
        setLongField(term256333, term256333.getClass(), "totalReMasterDeluxscore", -2161934513084385143L);
        setIntField(term256333, term256333.getClass(), "totalSync", 1025928124);
        setIntField(term256333, term256333.getClass(), "totalBasicSync", 1080394714);
        setIntField(term256333, term256333.getClass(), "totalAdvancedSync", -1472341235);
        setIntField(term256333, term256333.getClass(), "totalExpertSync", -1801361943);
        setIntField(term256333, term256333.getClass(), "totalMasterSync", 596985150);
        setIntField(term256333, term256333.getClass(), "totalReMasterSync", -1036612528);
        setLongField(term256333, term256333.getClass(), "totalAchievement", 4833845969834145978L);
        setLongField(term256333, term256333.getClass(), "totalBasicAchievement", 5445927853312310765L);
        setLongField(term256333, term256333.getClass(), "totalAdvancedAchievement", -8710795146223428235L);
        setLongField(term256333, term256333.getClass(), "totalExpertAchievement", -4467843392959422501L);
        setLongField(term256333, term256333.getClass(), "totalMasterAchievement", 8961367217118588250L);
        setLongField(term256333, term256333.getClass(), "totalReMasterAchievement", 212851134038142536L);
        setLongField(term256333, term256333.getClass(), "playerOldRating", 5380287243236542966L);
        setLongField(term256333, term256333.getClass(), "playerNewRating", 4157917806167586971L);
        setIntField(term256333, term256333.getClass(), "banState", 678116826);
        setLongField(term256333, term256333.getClass(), "dateTime", 2710884008767263028L);
        term256694 = new Integer(-968589797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term256694;
        callMethod(klass, "setLastPlaceId", argTypes, term256333, args);
    }

};


