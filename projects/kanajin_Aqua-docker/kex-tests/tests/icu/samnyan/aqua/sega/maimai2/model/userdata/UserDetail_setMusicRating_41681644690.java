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

public class UserDetail_setMusicRating_41681644690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246026;
     Object term246381;

    public UserDetail_setMusicRating_41681644690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term246030 = new Long(185544001230120339L);
        Integer term246093 = new Integer(-1428994415);
        Integer term246095 = new Integer(-1086104799);
        Integer term246097 = new Integer(1670332444);
        Integer term246099 = new Integer(-1903805864);
        Integer term246101 = new Integer(751123733);
        Integer term246103 = new Integer(-2099677081);
        Integer term246105 = new Integer(-1911852008);
        ArrayList term246091 = new ArrayList();
        ((ArrayList) term246091).add(term246093);
        ((ArrayList) term246091).add(term246095);
        ((ArrayList) term246091).add(term246097);
        ((ArrayList) term246091).add(term246099);
        ((ArrayList) term246091).add(term246101);
        ((ArrayList) term246091).add(term246103);
        ((ArrayList) term246091).add(term246105);
        Integer term246111 = new Integer(-126937505);
        ArrayList term246109 = new ArrayList();
        ((ArrayList) term246109).add(term246111);
        term246026 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term246028 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term246044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246049 = newInstance(Class.forName("java.time.LocalTime"));
        Object term246054 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246055 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246059 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term246026, term246026.getClass(), "id", -5139262225402867144L);
        setLongField(term246028, term246028.getClass(), "id", -2211694930961200578L);
        setField(term246028, term246028.getClass(), "extId", term246030);
        setField(term246028, term246028.getClass(), "luid", "GodVKYIlYA");
        setIntField(term246045, term246045.getClass(), "year", 2025);
        setShortField(term246045, term246045.getClass(), "month", (short) 2);
        setShortField(term246045, term246045.getClass(), "day", (short) 6);
        setField(term246044, term246044.getClass(), "date", term246045);
        setByteField(term246049, term246049.getClass(), "hour", (byte) 14);
        setByteField(term246049, term246049.getClass(), "minute", (byte) 28);
        setByteField(term246049, term246049.getClass(), "second", (byte) 25);
        setIntField(term246049, term246049.getClass(), "nano", 103816032);
        setField(term246044, term246044.getClass(), "time", term246049);
        setField(term246028, term246028.getClass(), "registerTime", term246044);
        setIntField(term246055, term246055.getClass(), "year", 2024);
        setShortField(term246055, term246055.getClass(), "month", (short) 7);
        setShortField(term246055, term246055.getClass(), "day", (short) 11);
        setField(term246054, term246054.getClass(), "date", term246055);
        setByteField(term246059, term246059.getClass(), "hour", (byte) 0);
        setByteField(term246059, term246059.getClass(), "minute", (byte) 35);
        setByteField(term246059, term246059.getClass(), "second", (byte) 43);
        setIntField(term246059, term246059.getClass(), "nano", 994892189);
        setField(term246054, term246054.getClass(), "time", term246059);
        setField(term246028, term246028.getClass(), "accessTime", term246054);
        setField(term246026, term246026.getClass(), "card", term246028);
        setField(term246026, term246026.getClass(), "userName", "eLhOBIiBWR");
        setIntField(term246026, term246026.getClass(), "isNetMember", -373129189);
        setIntField(term246026, term246026.getClass(), "iconId", 454194524);
        setIntField(term246026, term246026.getClass(), "plateId", -1558450532);
        setIntField(term246026, term246026.getClass(), "titleId", 239020439);
        setIntField(term246026, term246026.getClass(), "partnerId", 557187198);
        setIntField(term246026, term246026.getClass(), "frameId", -2031962212);
        setIntField(term246026, term246026.getClass(), "selectMapId", 1718205943);
        setIntField(term246026, term246026.getClass(), "totalAwake", 1181838305);
        setIntField(term246026, term246026.getClass(), "gradeRating", -972613396);
        setIntField(term246026, term246026.getClass(), "musicRating", -118493195);
        setIntField(term246026, term246026.getClass(), "playerRating", 762981298);
        setIntField(term246026, term246026.getClass(), "highestRating", -729574845);
        setIntField(term246026, term246026.getClass(), "gradeRank", -1849590708);
        setIntField(term246026, term246026.getClass(), "classRank", 2121883333);
        setIntField(term246026, term246026.getClass(), "courseRank", -794025316);
        setField(term246026, term246026.getClass(), "charaSlot", term246091);
        setField(term246026, term246026.getClass(), "charaLockSlot", term246109);
        setLongField(term246026, term246026.getClass(), "contentBit", 8405252812269794315L);
        setIntField(term246026, term246026.getClass(), "playCount", 252848871);
        setField(term246026, term246026.getClass(), "eventWatchedDate", "CpvhjniKFZ");
        setField(term246026, term246026.getClass(), "lastGameId", "nantHBTafl");
        setField(term246026, term246026.getClass(), "lastRomVersion", "IplLGmulHb");
        setField(term246026, term246026.getClass(), "lastDataVersion", "IOOirhBOLW");
        setField(term246026, term246026.getClass(), "lastLoginDate", "bpwHwZXzto");
        setField(term246026, term246026.getClass(), "lastPlayDate", "hBdHvULiAU");
        setIntField(term246026, term246026.getClass(), "lastPlayCredit", -917431784);
        setIntField(term246026, term246026.getClass(), "lastPlayMode", -579439570);
        setIntField(term246026, term246026.getClass(), "lastPlaceId", -1592976382);
        setField(term246026, term246026.getClass(), "lastPlaceName", "pmzpdxYYOU");
        setIntField(term246026, term246026.getClass(), "lastAllNetId", -585428898);
        setIntField(term246026, term246026.getClass(), "lastRegionId", -832361153);
        setField(term246026, term246026.getClass(), "lastRegionName", "eJfrlkUQVR");
        setField(term246026, term246026.getClass(), "lastClientId", "WKzneVTyGD");
        setField(term246026, term246026.getClass(), "lastCountryCode", "AplzVucnst");
        setIntField(term246026, term246026.getClass(), "lastSelectEMoney", 544931629);
        setIntField(term246026, term246026.getClass(), "lastSelectTicket", -1187175631);
        setIntField(term246026, term246026.getClass(), "lastSelectCourse", -1209302829);
        setIntField(term246026, term246026.getClass(), "lastCountCourse", 1452201291);
        setField(term246026, term246026.getClass(), "firstGameId", "JHBwnopNQH");
        setField(term246026, term246026.getClass(), "firstRomVersion", "ErpzGWArqi");
        setField(term246026, term246026.getClass(), "firstDataVersion", "QyJzVdCezt");
        setField(term246026, term246026.getClass(), "firstPlayDate", "HKOxwCgErb");
        setField(term246026, term246026.getClass(), "compatibleCmVersion", "rFFShpdqSC");
        setField(term246026, term246026.getClass(), "dailyBonusDate", "zEVAHUMUrR");
        setField(term246026, term246026.getClass(), "dailyCourseBonusDate", "KireOddAuf");
        setField(term246026, term246026.getClass(), "lastPairLoginDate", "ZAmXAZjSoT");
        setField(term246026, term246026.getClass(), "lastTrialPlayDate", "FMjzxMmDXl");
        setIntField(term246026, term246026.getClass(), "playVsCount", -238634517);
        setIntField(term246026, term246026.getClass(), "playSyncCount", -258929351);
        setIntField(term246026, term246026.getClass(), "winCount", 1333523587);
        setIntField(term246026, term246026.getClass(), "helpCount", 873176518);
        setIntField(term246026, term246026.getClass(), "comboCount", -1764702381);
        setLongField(term246026, term246026.getClass(), "totalDeluxscore", -5203768409207569553L);
        setLongField(term246026, term246026.getClass(), "totalBasicDeluxscore", -6460669538327346857L);
        setLongField(term246026, term246026.getClass(), "totalAdvancedDeluxscore", 567305937946057005L);
        setLongField(term246026, term246026.getClass(), "totalExpertDeluxscore", 4260526582008178602L);
        setLongField(term246026, term246026.getClass(), "totalMasterDeluxscore", 89890931608772173L);
        setLongField(term246026, term246026.getClass(), "totalReMasterDeluxscore", -4217888053836142890L);
        setIntField(term246026, term246026.getClass(), "totalSync", 1689905396);
        setIntField(term246026, term246026.getClass(), "totalBasicSync", 1359898476);
        setIntField(term246026, term246026.getClass(), "totalAdvancedSync", 658413530);
        setIntField(term246026, term246026.getClass(), "totalExpertSync", -912984604);
        setIntField(term246026, term246026.getClass(), "totalMasterSync", -584783034);
        setIntField(term246026, term246026.getClass(), "totalReMasterSync", -1409611196);
        setLongField(term246026, term246026.getClass(), "totalAchievement", 4753434311319905405L);
        setLongField(term246026, term246026.getClass(), "totalBasicAchievement", -4842461176442418000L);
        setLongField(term246026, term246026.getClass(), "totalAdvancedAchievement", 2392934682269525929L);
        setLongField(term246026, term246026.getClass(), "totalExpertAchievement", -1847186140469876459L);
        setLongField(term246026, term246026.getClass(), "totalMasterAchievement", 9165903102387997600L);
        setLongField(term246026, term246026.getClass(), "totalReMasterAchievement", -5616635437857915347L);
        setLongField(term246026, term246026.getClass(), "playerOldRating", -1566893501088264201L);
        setLongField(term246026, term246026.getClass(), "playerNewRating", 983565881911193843L);
        setIntField(term246026, term246026.getClass(), "banState", -909317577);
        setLongField(term246026, term246026.getClass(), "dateTime", -989073038682677715L);
        term246381 = new Integer(-621683769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term246381;
        callMethod(klass, "setMusicRating", argTypes, term246026, args);
    }

};


