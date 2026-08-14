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

public class UserDetail_getDailyBonusDate_60346613546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221612;

    public UserDetail_getDailyBonusDate_60346613546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term221616 = new Long(6273670659288205855L);
        Integer term221679 = new Integer(-233313895);
        Integer term221681 = new Integer(2014416586);
        Integer term221683 = new Integer(1614071253);
        Integer term221685 = new Integer(-548611489);
        Integer term221687 = new Integer(792588182);
        Integer term221689 = new Integer(1145540785);
        Integer term221691 = new Integer(-1255440898);
        Integer term221693 = new Integer(-1185096329);
        ArrayList term221677 = new ArrayList();
        ((ArrayList) term221677).add(term221679);
        ((ArrayList) term221677).add(term221681);
        ((ArrayList) term221677).add(term221683);
        ((ArrayList) term221677).add(term221685);
        ((ArrayList) term221677).add(term221687);
        ((ArrayList) term221677).add(term221689);
        ((ArrayList) term221677).add(term221691);
        ((ArrayList) term221677).add(term221693);
        Integer term221699 = new Integer(-2051822073);
        ArrayList term221697 = new ArrayList();
        ((ArrayList) term221697).add(term221699);
        term221612 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term221614 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term221630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term221640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221645 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term221612, term221612.getClass(), "id", 4327740955689019518L);
        setLongField(term221614, term221614.getClass(), "id", 1774687762041286011L);
        setField(term221614, term221614.getClass(), "extId", term221616);
        setField(term221614, term221614.getClass(), "luid", "mkhmhvwesD");
        setIntField(term221631, term221631.getClass(), "year", 2019);
        setShortField(term221631, term221631.getClass(), "month", (short) 7);
        setShortField(term221631, term221631.getClass(), "day", (short) 7);
        setField(term221630, term221630.getClass(), "date", term221631);
        setByteField(term221635, term221635.getClass(), "hour", (byte) 22);
        setByteField(term221635, term221635.getClass(), "minute", (byte) 43);
        setByteField(term221635, term221635.getClass(), "second", (byte) 9);
        setIntField(term221635, term221635.getClass(), "nano", 17138447);
        setField(term221630, term221630.getClass(), "time", term221635);
        setField(term221614, term221614.getClass(), "registerTime", term221630);
        setIntField(term221641, term221641.getClass(), "year", 2026);
        setShortField(term221641, term221641.getClass(), "month", (short) 5);
        setShortField(term221641, term221641.getClass(), "day", (short) 13);
        setField(term221640, term221640.getClass(), "date", term221641);
        setByteField(term221645, term221645.getClass(), "hour", (byte) 21);
        setByteField(term221645, term221645.getClass(), "minute", (byte) 41);
        setByteField(term221645, term221645.getClass(), "second", (byte) 14);
        setIntField(term221645, term221645.getClass(), "nano", 302456774);
        setField(term221640, term221640.getClass(), "time", term221645);
        setField(term221614, term221614.getClass(), "accessTime", term221640);
        setField(term221612, term221612.getClass(), "card", term221614);
        setField(term221612, term221612.getClass(), "userName", "JpSiXbZnGJ");
        setIntField(term221612, term221612.getClass(), "isNetMember", 1028623562);
        setIntField(term221612, term221612.getClass(), "iconId", 731074367);
        setIntField(term221612, term221612.getClass(), "plateId", 969220339);
        setIntField(term221612, term221612.getClass(), "titleId", 78410083);
        setIntField(term221612, term221612.getClass(), "partnerId", -1308398792);
        setIntField(term221612, term221612.getClass(), "frameId", 1624205154);
        setIntField(term221612, term221612.getClass(), "selectMapId", 872444404);
        setIntField(term221612, term221612.getClass(), "totalAwake", 1400687352);
        setIntField(term221612, term221612.getClass(), "gradeRating", 1391309255);
        setIntField(term221612, term221612.getClass(), "musicRating", 437885281);
        setIntField(term221612, term221612.getClass(), "playerRating", 1144296384);
        setIntField(term221612, term221612.getClass(), "highestRating", 375541509);
        setIntField(term221612, term221612.getClass(), "gradeRank", 1549543162);
        setIntField(term221612, term221612.getClass(), "classRank", -893278459);
        setIntField(term221612, term221612.getClass(), "courseRank", -2086759387);
        setField(term221612, term221612.getClass(), "charaSlot", term221677);
        setField(term221612, term221612.getClass(), "charaLockSlot", term221697);
        setLongField(term221612, term221612.getClass(), "contentBit", -8824711801896933895L);
        setIntField(term221612, term221612.getClass(), "playCount", -1639130879);
        setField(term221612, term221612.getClass(), "eventWatchedDate", "MvKMYHZzgK");
        setField(term221612, term221612.getClass(), "lastGameId", "rXHwCIUxfV");
        setField(term221612, term221612.getClass(), "lastRomVersion", "ulQMqmFZnB");
        setField(term221612, term221612.getClass(), "lastDataVersion", "bLUjUsNvNe");
        setField(term221612, term221612.getClass(), "lastLoginDate", "bBKyatMuCx");
        setField(term221612, term221612.getClass(), "lastPlayDate", "FAeRotuBPc");
        setIntField(term221612, term221612.getClass(), "lastPlayCredit", -1439372378);
        setIntField(term221612, term221612.getClass(), "lastPlayMode", -1838240610);
        setIntField(term221612, term221612.getClass(), "lastPlaceId", 676840233);
        setField(term221612, term221612.getClass(), "lastPlaceName", "yKPLRLjEEs");
        setIntField(term221612, term221612.getClass(), "lastAllNetId", -125724279);
        setIntField(term221612, term221612.getClass(), "lastRegionId", -1125931561);
        setField(term221612, term221612.getClass(), "lastRegionName", "GBMsbigXmJ");
        setField(term221612, term221612.getClass(), "lastClientId", "iyaEOvRXxa");
        setField(term221612, term221612.getClass(), "lastCountryCode", "FhUiFZanfe");
        setIntField(term221612, term221612.getClass(), "lastSelectEMoney", -1395442669);
        setIntField(term221612, term221612.getClass(), "lastSelectTicket", 868823701);
        setIntField(term221612, term221612.getClass(), "lastSelectCourse", 588180);
        setIntField(term221612, term221612.getClass(), "lastCountCourse", 1798567411);
        setField(term221612, term221612.getClass(), "firstGameId", "aYivLISRyW");
        setField(term221612, term221612.getClass(), "firstRomVersion", "RrSBRpwDUO");
        setField(term221612, term221612.getClass(), "firstDataVersion", "wOykMlVxUu");
        setField(term221612, term221612.getClass(), "firstPlayDate", "bzUpBVXJnh");
        setField(term221612, term221612.getClass(), "compatibleCmVersion", "hSMGLdcXOh");
        setField(term221612, term221612.getClass(), "dailyBonusDate", "FvaUDcOcsU");
        setField(term221612, term221612.getClass(), "dailyCourseBonusDate", "OYduZlviNG");
        setField(term221612, term221612.getClass(), "lastPairLoginDate", "aMnHEJInph");
        setField(term221612, term221612.getClass(), "lastTrialPlayDate", "GJKNgpxbLF");
        setIntField(term221612, term221612.getClass(), "playVsCount", -1507879623);
        setIntField(term221612, term221612.getClass(), "playSyncCount", 727263670);
        setIntField(term221612, term221612.getClass(), "winCount", -2042954517);
        setIntField(term221612, term221612.getClass(), "helpCount", -1585735136);
        setIntField(term221612, term221612.getClass(), "comboCount", -202469528);
        setLongField(term221612, term221612.getClass(), "totalDeluxscore", 5950037709703196714L);
        setLongField(term221612, term221612.getClass(), "totalBasicDeluxscore", 242006361301869544L);
        setLongField(term221612, term221612.getClass(), "totalAdvancedDeluxscore", -1590504445722854169L);
        setLongField(term221612, term221612.getClass(), "totalExpertDeluxscore", 4502587906620534305L);
        setLongField(term221612, term221612.getClass(), "totalMasterDeluxscore", 7871216210100524966L);
        setLongField(term221612, term221612.getClass(), "totalReMasterDeluxscore", 4571799750733226029L);
        setIntField(term221612, term221612.getClass(), "totalSync", -1147825822);
        setIntField(term221612, term221612.getClass(), "totalBasicSync", -192227369);
        setIntField(term221612, term221612.getClass(), "totalAdvancedSync", 1203299299);
        setIntField(term221612, term221612.getClass(), "totalExpertSync", -115406772);
        setIntField(term221612, term221612.getClass(), "totalMasterSync", -1194681287);
        setIntField(term221612, term221612.getClass(), "totalReMasterSync", -24531941);
        setLongField(term221612, term221612.getClass(), "totalAchievement", 1184670454132020771L);
        setLongField(term221612, term221612.getClass(), "totalBasicAchievement", -6792463087823140857L);
        setLongField(term221612, term221612.getClass(), "totalAdvancedAchievement", -4718834427563357621L);
        setLongField(term221612, term221612.getClass(), "totalExpertAchievement", -6091670037966212829L);
        setLongField(term221612, term221612.getClass(), "totalMasterAchievement", 1074906989807546075L);
        setLongField(term221612, term221612.getClass(), "totalReMasterAchievement", -8890450421014996047L);
        setLongField(term221612, term221612.getClass(), "playerOldRating", 8667512289505966663L);
        setLongField(term221612, term221612.getClass(), "playerNewRating", 4744547938905662498L);
        setIntField(term221612, term221612.getClass(), "banState", 1265656841);
        setLongField(term221612, term221612.getClass(), "dateTime", 6908669679539387356L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyBonusDate", argTypes, term221612, args);
    }

};


