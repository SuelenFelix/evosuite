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

public class UserDetail_setMusicRating_41681644689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245971;
     Object term246326;

    public UserDetail_setMusicRating_41681644689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term245975 = new Long(185544001230120339L);
        Integer term246038 = new Integer(-1428994415);
        Integer term246040 = new Integer(-1086104799);
        Integer term246042 = new Integer(1670332444);
        Integer term246044 = new Integer(-1903805864);
        Integer term246046 = new Integer(751123733);
        Integer term246048 = new Integer(-2099677081);
        Integer term246050 = new Integer(-1911852008);
        ArrayList term246036 = new ArrayList();
        ((ArrayList) term246036).add(term246038);
        ((ArrayList) term246036).add(term246040);
        ((ArrayList) term246036).add(term246042);
        ((ArrayList) term246036).add(term246044);
        ((ArrayList) term246036).add(term246046);
        ((ArrayList) term246036).add(term246048);
        ((ArrayList) term246036).add(term246050);
        Integer term246056 = new Integer(-126937505);
        ArrayList term246054 = new ArrayList();
        ((ArrayList) term246054).add(term246056);
        term245971 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term245973 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term245989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term245990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term245994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term245999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246004 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term245971, term245971.getClass(), "id", -5139262225402867144L);
        setLongField(term245973, term245973.getClass(), "id", -2211694930961200578L);
        setField(term245973, term245973.getClass(), "extId", term245975);
        setField(term245973, term245973.getClass(), "luid", "GodVKYIlYA");
        setIntField(term245990, term245990.getClass(), "year", 2025);
        setShortField(term245990, term245990.getClass(), "month", (short) 2);
        setShortField(term245990, term245990.getClass(), "day", (short) 6);
        setField(term245989, term245989.getClass(), "date", term245990);
        setByteField(term245994, term245994.getClass(), "hour", (byte) 14);
        setByteField(term245994, term245994.getClass(), "minute", (byte) 28);
        setByteField(term245994, term245994.getClass(), "second", (byte) 25);
        setIntField(term245994, term245994.getClass(), "nano", 103816032);
        setField(term245989, term245989.getClass(), "time", term245994);
        setField(term245973, term245973.getClass(), "registerTime", term245989);
        setIntField(term246000, term246000.getClass(), "year", 2024);
        setShortField(term246000, term246000.getClass(), "month", (short) 7);
        setShortField(term246000, term246000.getClass(), "day", (short) 11);
        setField(term245999, term245999.getClass(), "date", term246000);
        setByteField(term246004, term246004.getClass(), "hour", (byte) 0);
        setByteField(term246004, term246004.getClass(), "minute", (byte) 35);
        setByteField(term246004, term246004.getClass(), "second", (byte) 43);
        setIntField(term246004, term246004.getClass(), "nano", 994892189);
        setField(term245999, term245999.getClass(), "time", term246004);
        setField(term245973, term245973.getClass(), "accessTime", term245999);
        setField(term245971, term245971.getClass(), "card", term245973);
        setField(term245971, term245971.getClass(), "userName", "eLhOBIiBWR");
        setIntField(term245971, term245971.getClass(), "isNetMember", -373129189);
        setIntField(term245971, term245971.getClass(), "iconId", 454194524);
        setIntField(term245971, term245971.getClass(), "plateId", -1558450532);
        setIntField(term245971, term245971.getClass(), "titleId", 239020439);
        setIntField(term245971, term245971.getClass(), "partnerId", 557187198);
        setIntField(term245971, term245971.getClass(), "frameId", -2031962212);
        setIntField(term245971, term245971.getClass(), "selectMapId", 1718205943);
        setIntField(term245971, term245971.getClass(), "totalAwake", 1181838305);
        setIntField(term245971, term245971.getClass(), "gradeRating", -972613396);
        setIntField(term245971, term245971.getClass(), "musicRating", -118493195);
        setIntField(term245971, term245971.getClass(), "playerRating", 762981298);
        setIntField(term245971, term245971.getClass(), "highestRating", -729574845);
        setIntField(term245971, term245971.getClass(), "gradeRank", -1849590708);
        setIntField(term245971, term245971.getClass(), "classRank", 2121883333);
        setIntField(term245971, term245971.getClass(), "courseRank", -794025316);
        setField(term245971, term245971.getClass(), "charaSlot", term246036);
        setField(term245971, term245971.getClass(), "charaLockSlot", term246054);
        setLongField(term245971, term245971.getClass(), "contentBit", 8405252812269794315L);
        setIntField(term245971, term245971.getClass(), "playCount", 252848871);
        setField(term245971, term245971.getClass(), "eventWatchedDate", "CpvhjniKFZ");
        setField(term245971, term245971.getClass(), "lastGameId", "nantHBTafl");
        setField(term245971, term245971.getClass(), "lastRomVersion", "IplLGmulHb");
        setField(term245971, term245971.getClass(), "lastDataVersion", "IOOirhBOLW");
        setField(term245971, term245971.getClass(), "lastLoginDate", "bpwHwZXzto");
        setField(term245971, term245971.getClass(), "lastPlayDate", "hBdHvULiAU");
        setIntField(term245971, term245971.getClass(), "lastPlayCredit", -917431784);
        setIntField(term245971, term245971.getClass(), "lastPlayMode", -579439570);
        setIntField(term245971, term245971.getClass(), "lastPlaceId", -1592976382);
        setField(term245971, term245971.getClass(), "lastPlaceName", "pmzpdxYYOU");
        setIntField(term245971, term245971.getClass(), "lastAllNetId", -585428898);
        setIntField(term245971, term245971.getClass(), "lastRegionId", -832361153);
        setField(term245971, term245971.getClass(), "lastRegionName", "eJfrlkUQVR");
        setField(term245971, term245971.getClass(), "lastClientId", "WKzneVTyGD");
        setField(term245971, term245971.getClass(), "lastCountryCode", "AplzVucnst");
        setIntField(term245971, term245971.getClass(), "lastSelectEMoney", 544931629);
        setIntField(term245971, term245971.getClass(), "lastSelectTicket", -1187175631);
        setIntField(term245971, term245971.getClass(), "lastSelectCourse", -1209302829);
        setIntField(term245971, term245971.getClass(), "lastCountCourse", 1452201291);
        setField(term245971, term245971.getClass(), "firstGameId", "JHBwnopNQH");
        setField(term245971, term245971.getClass(), "firstRomVersion", "ErpzGWArqi");
        setField(term245971, term245971.getClass(), "firstDataVersion", "QyJzVdCezt");
        setField(term245971, term245971.getClass(), "firstPlayDate", "HKOxwCgErb");
        setField(term245971, term245971.getClass(), "compatibleCmVersion", "rFFShpdqSC");
        setField(term245971, term245971.getClass(), "dailyBonusDate", "zEVAHUMUrR");
        setField(term245971, term245971.getClass(), "dailyCourseBonusDate", "KireOddAuf");
        setField(term245971, term245971.getClass(), "lastPairLoginDate", "ZAmXAZjSoT");
        setField(term245971, term245971.getClass(), "lastTrialPlayDate", "FMjzxMmDXl");
        setIntField(term245971, term245971.getClass(), "playVsCount", -238634517);
        setIntField(term245971, term245971.getClass(), "playSyncCount", -258929351);
        setIntField(term245971, term245971.getClass(), "winCount", 1333523587);
        setIntField(term245971, term245971.getClass(), "helpCount", 873176518);
        setIntField(term245971, term245971.getClass(), "comboCount", -1764702381);
        setLongField(term245971, term245971.getClass(), "totalDeluxscore", -5203768409207569553L);
        setLongField(term245971, term245971.getClass(), "totalBasicDeluxscore", -6460669538327346857L);
        setLongField(term245971, term245971.getClass(), "totalAdvancedDeluxscore", 567305937946057005L);
        setLongField(term245971, term245971.getClass(), "totalExpertDeluxscore", 4260526582008178602L);
        setLongField(term245971, term245971.getClass(), "totalMasterDeluxscore", 89890931608772173L);
        setLongField(term245971, term245971.getClass(), "totalReMasterDeluxscore", -4217888053836142890L);
        setIntField(term245971, term245971.getClass(), "totalSync", 1689905396);
        setIntField(term245971, term245971.getClass(), "totalBasicSync", 1359898476);
        setIntField(term245971, term245971.getClass(), "totalAdvancedSync", 658413530);
        setIntField(term245971, term245971.getClass(), "totalExpertSync", -912984604);
        setIntField(term245971, term245971.getClass(), "totalMasterSync", -584783034);
        setIntField(term245971, term245971.getClass(), "totalReMasterSync", -1409611196);
        setLongField(term245971, term245971.getClass(), "totalAchievement", 4753434311319905405L);
        setLongField(term245971, term245971.getClass(), "totalBasicAchievement", -4842461176442418000L);
        setLongField(term245971, term245971.getClass(), "totalAdvancedAchievement", 2392934682269525929L);
        setLongField(term245971, term245971.getClass(), "totalExpertAchievement", -1847186140469876459L);
        setLongField(term245971, term245971.getClass(), "totalMasterAchievement", 9165903102387997600L);
        setLongField(term245971, term245971.getClass(), "totalReMasterAchievement", -5616635437857915347L);
        setLongField(term245971, term245971.getClass(), "playerOldRating", -1566893501088264201L);
        setLongField(term245971, term245971.getClass(), "playerNewRating", 983565881911193843L);
        setIntField(term245971, term245971.getClass(), "banState", -909317577);
        setLongField(term245971, term245971.getClass(), "dateTime", -989073038682677715L);
        term246326 = new Integer(-621683769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term246326;
        callMethod(klass, "setMusicRating", argTypes, term245971, args);
    }

};


