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

public class UserDetail_getDailyBonusDate_60346613547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221667;

    public UserDetail_getDailyBonusDate_60346613547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term221671 = new Long(6273670659288205855L);
        Integer term221734 = new Integer(-233313895);
        Integer term221736 = new Integer(2014416586);
        Integer term221738 = new Integer(1614071253);
        Integer term221740 = new Integer(-548611489);
        Integer term221742 = new Integer(792588182);
        Integer term221744 = new Integer(1145540785);
        Integer term221746 = new Integer(-1255440898);
        Integer term221748 = new Integer(-1185096329);
        ArrayList term221732 = new ArrayList();
        ((ArrayList) term221732).add(term221734);
        ((ArrayList) term221732).add(term221736);
        ((ArrayList) term221732).add(term221738);
        ((ArrayList) term221732).add(term221740);
        ((ArrayList) term221732).add(term221742);
        ((ArrayList) term221732).add(term221744);
        ((ArrayList) term221732).add(term221746);
        ((ArrayList) term221732).add(term221748);
        Integer term221754 = new Integer(-2051822073);
        ArrayList term221752 = new ArrayList();
        ((ArrayList) term221752).add(term221754);
        term221667 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term221669 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term221685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221690 = newInstance(Class.forName("java.time.LocalTime"));
        Object term221695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221700 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term221667, term221667.getClass(), "id", 4327740955689019518L);
        setLongField(term221669, term221669.getClass(), "id", 1774687762041286011L);
        setField(term221669, term221669.getClass(), "extId", term221671);
        setField(term221669, term221669.getClass(), "luid", "mkhmhvwesD");
        setIntField(term221686, term221686.getClass(), "year", 2019);
        setShortField(term221686, term221686.getClass(), "month", (short) 7);
        setShortField(term221686, term221686.getClass(), "day", (short) 7);
        setField(term221685, term221685.getClass(), "date", term221686);
        setByteField(term221690, term221690.getClass(), "hour", (byte) 22);
        setByteField(term221690, term221690.getClass(), "minute", (byte) 43);
        setByteField(term221690, term221690.getClass(), "second", (byte) 9);
        setIntField(term221690, term221690.getClass(), "nano", 17138447);
        setField(term221685, term221685.getClass(), "time", term221690);
        setField(term221669, term221669.getClass(), "registerTime", term221685);
        setIntField(term221696, term221696.getClass(), "year", 2026);
        setShortField(term221696, term221696.getClass(), "month", (short) 5);
        setShortField(term221696, term221696.getClass(), "day", (short) 13);
        setField(term221695, term221695.getClass(), "date", term221696);
        setByteField(term221700, term221700.getClass(), "hour", (byte) 21);
        setByteField(term221700, term221700.getClass(), "minute", (byte) 41);
        setByteField(term221700, term221700.getClass(), "second", (byte) 14);
        setIntField(term221700, term221700.getClass(), "nano", 302456774);
        setField(term221695, term221695.getClass(), "time", term221700);
        setField(term221669, term221669.getClass(), "accessTime", term221695);
        setField(term221667, term221667.getClass(), "card", term221669);
        setField(term221667, term221667.getClass(), "userName", "JpSiXbZnGJ");
        setIntField(term221667, term221667.getClass(), "isNetMember", 1028623562);
        setIntField(term221667, term221667.getClass(), "iconId", 731074367);
        setIntField(term221667, term221667.getClass(), "plateId", 969220339);
        setIntField(term221667, term221667.getClass(), "titleId", 78410083);
        setIntField(term221667, term221667.getClass(), "partnerId", -1308398792);
        setIntField(term221667, term221667.getClass(), "frameId", 1624205154);
        setIntField(term221667, term221667.getClass(), "selectMapId", 872444404);
        setIntField(term221667, term221667.getClass(), "totalAwake", 1400687352);
        setIntField(term221667, term221667.getClass(), "gradeRating", 1391309255);
        setIntField(term221667, term221667.getClass(), "musicRating", 437885281);
        setIntField(term221667, term221667.getClass(), "playerRating", 1144296384);
        setIntField(term221667, term221667.getClass(), "highestRating", 375541509);
        setIntField(term221667, term221667.getClass(), "gradeRank", 1549543162);
        setIntField(term221667, term221667.getClass(), "classRank", -893278459);
        setIntField(term221667, term221667.getClass(), "courseRank", -2086759387);
        setField(term221667, term221667.getClass(), "charaSlot", term221732);
        setField(term221667, term221667.getClass(), "charaLockSlot", term221752);
        setLongField(term221667, term221667.getClass(), "contentBit", -8824711801896933895L);
        setIntField(term221667, term221667.getClass(), "playCount", -1639130879);
        setField(term221667, term221667.getClass(), "eventWatchedDate", "MvKMYHZzgK");
        setField(term221667, term221667.getClass(), "lastGameId", "rXHwCIUxfV");
        setField(term221667, term221667.getClass(), "lastRomVersion", "ulQMqmFZnB");
        setField(term221667, term221667.getClass(), "lastDataVersion", "bLUjUsNvNe");
        setField(term221667, term221667.getClass(), "lastLoginDate", "bBKyatMuCx");
        setField(term221667, term221667.getClass(), "lastPlayDate", "FAeRotuBPc");
        setIntField(term221667, term221667.getClass(), "lastPlayCredit", -1439372378);
        setIntField(term221667, term221667.getClass(), "lastPlayMode", -1838240610);
        setIntField(term221667, term221667.getClass(), "lastPlaceId", 676840233);
        setField(term221667, term221667.getClass(), "lastPlaceName", "yKPLRLjEEs");
        setIntField(term221667, term221667.getClass(), "lastAllNetId", -125724279);
        setIntField(term221667, term221667.getClass(), "lastRegionId", -1125931561);
        setField(term221667, term221667.getClass(), "lastRegionName", "GBMsbigXmJ");
        setField(term221667, term221667.getClass(), "lastClientId", "iyaEOvRXxa");
        setField(term221667, term221667.getClass(), "lastCountryCode", "FhUiFZanfe");
        setIntField(term221667, term221667.getClass(), "lastSelectEMoney", -1395442669);
        setIntField(term221667, term221667.getClass(), "lastSelectTicket", 868823701);
        setIntField(term221667, term221667.getClass(), "lastSelectCourse", 588180);
        setIntField(term221667, term221667.getClass(), "lastCountCourse", 1798567411);
        setField(term221667, term221667.getClass(), "firstGameId", "aYivLISRyW");
        setField(term221667, term221667.getClass(), "firstRomVersion", "RrSBRpwDUO");
        setField(term221667, term221667.getClass(), "firstDataVersion", "wOykMlVxUu");
        setField(term221667, term221667.getClass(), "firstPlayDate", "bzUpBVXJnh");
        setField(term221667, term221667.getClass(), "compatibleCmVersion", "hSMGLdcXOh");
        setField(term221667, term221667.getClass(), "dailyBonusDate", "FvaUDcOcsU");
        setField(term221667, term221667.getClass(), "dailyCourseBonusDate", "OYduZlviNG");
        setField(term221667, term221667.getClass(), "lastPairLoginDate", "aMnHEJInph");
        setField(term221667, term221667.getClass(), "lastTrialPlayDate", "GJKNgpxbLF");
        setIntField(term221667, term221667.getClass(), "playVsCount", -1507879623);
        setIntField(term221667, term221667.getClass(), "playSyncCount", 727263670);
        setIntField(term221667, term221667.getClass(), "winCount", -2042954517);
        setIntField(term221667, term221667.getClass(), "helpCount", -1585735136);
        setIntField(term221667, term221667.getClass(), "comboCount", -202469528);
        setLongField(term221667, term221667.getClass(), "totalDeluxscore", 5950037709703196714L);
        setLongField(term221667, term221667.getClass(), "totalBasicDeluxscore", 242006361301869544L);
        setLongField(term221667, term221667.getClass(), "totalAdvancedDeluxscore", -1590504445722854169L);
        setLongField(term221667, term221667.getClass(), "totalExpertDeluxscore", 4502587906620534305L);
        setLongField(term221667, term221667.getClass(), "totalMasterDeluxscore", 7871216210100524966L);
        setLongField(term221667, term221667.getClass(), "totalReMasterDeluxscore", 4571799750733226029L);
        setIntField(term221667, term221667.getClass(), "totalSync", -1147825822);
        setIntField(term221667, term221667.getClass(), "totalBasicSync", -192227369);
        setIntField(term221667, term221667.getClass(), "totalAdvancedSync", 1203299299);
        setIntField(term221667, term221667.getClass(), "totalExpertSync", -115406772);
        setIntField(term221667, term221667.getClass(), "totalMasterSync", -1194681287);
        setIntField(term221667, term221667.getClass(), "totalReMasterSync", -24531941);
        setLongField(term221667, term221667.getClass(), "totalAchievement", 1184670454132020771L);
        setLongField(term221667, term221667.getClass(), "totalBasicAchievement", -6792463087823140857L);
        setLongField(term221667, term221667.getClass(), "totalAdvancedAchievement", -4718834427563357621L);
        setLongField(term221667, term221667.getClass(), "totalExpertAchievement", -6091670037966212829L);
        setLongField(term221667, term221667.getClass(), "totalMasterAchievement", 1074906989807546075L);
        setLongField(term221667, term221667.getClass(), "totalReMasterAchievement", -8890450421014996047L);
        setLongField(term221667, term221667.getClass(), "playerOldRating", 8667512289505966663L);
        setLongField(term221667, term221667.getClass(), "playerNewRating", 4744547938905662498L);
        setIntField(term221667, term221667.getClass(), "banState", 1265656841);
        setLongField(term221667, term221667.getClass(), "dateTime", 6908669679539387356L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyBonusDate", argTypes, term221667, args);
    }

};


