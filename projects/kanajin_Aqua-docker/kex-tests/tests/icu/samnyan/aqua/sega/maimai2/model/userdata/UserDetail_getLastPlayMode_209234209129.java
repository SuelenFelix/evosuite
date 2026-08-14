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

public class UserDetail_getLastPlayMode_209234209129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211989;

    public UserDetail_getLastPlayMode_209234209129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term211993 = new Long(-8306611953768020559L);
        Integer term212056 = new Integer(-547325184);
        Integer term212058 = new Integer(1470261214);
        Integer term212060 = new Integer(1402619496);
        ArrayList term212054 = new ArrayList();
        ((ArrayList) term212054).add(term212056);
        ((ArrayList) term212054).add(term212058);
        ((ArrayList) term212054).add(term212060);
        Integer term212066 = new Integer(1253501512);
        Integer term212068 = new Integer(594655877);
        Integer term212070 = new Integer(281155455);
        Integer term212072 = new Integer(85079003);
        Integer term212074 = new Integer(-2010823131);
        Integer term212076 = new Integer(-1368198865);
        Integer term212078 = new Integer(-14635574);
        ArrayList term212064 = new ArrayList();
        ((ArrayList) term212064).add(term212066);
        ((ArrayList) term212064).add(term212068);
        ((ArrayList) term212064).add(term212070);
        ((ArrayList) term212064).add(term212072);
        ((ArrayList) term212064).add(term212074);
        ((ArrayList) term212064).add(term212076);
        ((ArrayList) term212064).add(term212078);
        term211989 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term211991 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term212007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term212017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212022 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term211989, term211989.getClass(), "id", -8684145874664265954L);
        setLongField(term211991, term211991.getClass(), "id", 6184486464044924915L);
        setField(term211991, term211991.getClass(), "extId", term211993);
        setField(term211991, term211991.getClass(), "luid", "JeoRsvMLJu");
        setIntField(term212008, term212008.getClass(), "year", 2027);
        setShortField(term212008, term212008.getClass(), "month", (short) 2);
        setShortField(term212008, term212008.getClass(), "day", (short) 11);
        setField(term212007, term212007.getClass(), "date", term212008);
        setByteField(term212012, term212012.getClass(), "hour", (byte) 8);
        setByteField(term212012, term212012.getClass(), "minute", (byte) 5);
        setByteField(term212012, term212012.getClass(), "second", (byte) 22);
        setIntField(term212012, term212012.getClass(), "nano", 32017661);
        setField(term212007, term212007.getClass(), "time", term212012);
        setField(term211991, term211991.getClass(), "registerTime", term212007);
        setIntField(term212018, term212018.getClass(), "year", 2025);
        setShortField(term212018, term212018.getClass(), "month", (short) 9);
        setShortField(term212018, term212018.getClass(), "day", (short) 24);
        setField(term212017, term212017.getClass(), "date", term212018);
        setByteField(term212022, term212022.getClass(), "hour", (byte) 4);
        setByteField(term212022, term212022.getClass(), "minute", (byte) 49);
        setByteField(term212022, term212022.getClass(), "second", (byte) 51);
        setIntField(term212022, term212022.getClass(), "nano", 103885357);
        setField(term212017, term212017.getClass(), "time", term212022);
        setField(term211991, term211991.getClass(), "accessTime", term212017);
        setField(term211989, term211989.getClass(), "card", term211991);
        setField(term211989, term211989.getClass(), "userName", "NqFbjpqVyg");
        setIntField(term211989, term211989.getClass(), "isNetMember", -743128849);
        setIntField(term211989, term211989.getClass(), "iconId", 2106293234);
        setIntField(term211989, term211989.getClass(), "plateId", -1923952746);
        setIntField(term211989, term211989.getClass(), "titleId", -148556232);
        setIntField(term211989, term211989.getClass(), "partnerId", 1463939393);
        setIntField(term211989, term211989.getClass(), "frameId", 1437316718);
        setIntField(term211989, term211989.getClass(), "selectMapId", -1967495289);
        setIntField(term211989, term211989.getClass(), "totalAwake", 359190711);
        setIntField(term211989, term211989.getClass(), "gradeRating", 440478914);
        setIntField(term211989, term211989.getClass(), "musicRating", -2057546484);
        setIntField(term211989, term211989.getClass(), "playerRating", -506584220);
        setIntField(term211989, term211989.getClass(), "highestRating", 1245589816);
        setIntField(term211989, term211989.getClass(), "gradeRank", -1631923422);
        setIntField(term211989, term211989.getClass(), "classRank", -139570037);
        setIntField(term211989, term211989.getClass(), "courseRank", -2107792262);
        setField(term211989, term211989.getClass(), "charaSlot", term212054);
        setField(term211989, term211989.getClass(), "charaLockSlot", term212064);
        setLongField(term211989, term211989.getClass(), "contentBit", 118121846535536532L);
        setIntField(term211989, term211989.getClass(), "playCount", -1575358689);
        setField(term211989, term211989.getClass(), "eventWatchedDate", "hijcLDmzdk");
        setField(term211989, term211989.getClass(), "lastGameId", "UYyogsENOg");
        setField(term211989, term211989.getClass(), "lastRomVersion", "NDsTwzxgnZ");
        setField(term211989, term211989.getClass(), "lastDataVersion", "GZCtzcvbAL");
        setField(term211989, term211989.getClass(), "lastLoginDate", "wyOTuvqxiR");
        setField(term211989, term211989.getClass(), "lastPlayDate", "xMLjisTCEc");
        setIntField(term211989, term211989.getClass(), "lastPlayCredit", -1187736992);
        setIntField(term211989, term211989.getClass(), "lastPlayMode", 1979137255);
        setIntField(term211989, term211989.getClass(), "lastPlaceId", 761578264);
        setField(term211989, term211989.getClass(), "lastPlaceName", "nGnUuIuxio");
        setIntField(term211989, term211989.getClass(), "lastAllNetId", -44684070);
        setIntField(term211989, term211989.getClass(), "lastRegionId", 1156887680);
        setField(term211989, term211989.getClass(), "lastRegionName", "jBEIwVuxjq");
        setField(term211989, term211989.getClass(), "lastClientId", "KQpsxSLFZN");
        setField(term211989, term211989.getClass(), "lastCountryCode", "BNJVoYwjAZ");
        setIntField(term211989, term211989.getClass(), "lastSelectEMoney", -1707544833);
        setIntField(term211989, term211989.getClass(), "lastSelectTicket", -1188072095);
        setIntField(term211989, term211989.getClass(), "lastSelectCourse", -129083358);
        setIntField(term211989, term211989.getClass(), "lastCountCourse", 490738811);
        setField(term211989, term211989.getClass(), "firstGameId", "lVfKFsFBWA");
        setField(term211989, term211989.getClass(), "firstRomVersion", "VdFBFoszPe");
        setField(term211989, term211989.getClass(), "firstDataVersion", "rvwSslhUVa");
        setField(term211989, term211989.getClass(), "firstPlayDate", "EZOoIMIpbM");
        setField(term211989, term211989.getClass(), "compatibleCmVersion", "GhqMKYSXsr");
        setField(term211989, term211989.getClass(), "dailyBonusDate", "ingAwvtJee");
        setField(term211989, term211989.getClass(), "dailyCourseBonusDate", "vWDwaLjhUo");
        setField(term211989, term211989.getClass(), "lastPairLoginDate", "LtqQluOtgh");
        setField(term211989, term211989.getClass(), "lastTrialPlayDate", "FCowYViZtk");
        setIntField(term211989, term211989.getClass(), "playVsCount", 25569400);
        setIntField(term211989, term211989.getClass(), "playSyncCount", 584372068);
        setIntField(term211989, term211989.getClass(), "winCount", 1228941953);
        setIntField(term211989, term211989.getClass(), "helpCount", 776859255);
        setIntField(term211989, term211989.getClass(), "comboCount", -1731141151);
        setLongField(term211989, term211989.getClass(), "totalDeluxscore", 5879904684522357083L);
        setLongField(term211989, term211989.getClass(), "totalBasicDeluxscore", -5691889245806551277L);
        setLongField(term211989, term211989.getClass(), "totalAdvancedDeluxscore", -6512389011040053178L);
        setLongField(term211989, term211989.getClass(), "totalExpertDeluxscore", 2334977869221007279L);
        setLongField(term211989, term211989.getClass(), "totalMasterDeluxscore", -2975258849885931140L);
        setLongField(term211989, term211989.getClass(), "totalReMasterDeluxscore", -6003717814161098421L);
        setIntField(term211989, term211989.getClass(), "totalSync", -1411813271);
        setIntField(term211989, term211989.getClass(), "totalBasicSync", -300044781);
        setIntField(term211989, term211989.getClass(), "totalAdvancedSync", 78380856);
        setIntField(term211989, term211989.getClass(), "totalExpertSync", 901638935);
        setIntField(term211989, term211989.getClass(), "totalMasterSync", -285544051);
        setIntField(term211989, term211989.getClass(), "totalReMasterSync", 351554192);
        setLongField(term211989, term211989.getClass(), "totalAchievement", -3020253339404333814L);
        setLongField(term211989, term211989.getClass(), "totalBasicAchievement", -6839370691097851368L);
        setLongField(term211989, term211989.getClass(), "totalAdvancedAchievement", 2413473793515484262L);
        setLongField(term211989, term211989.getClass(), "totalExpertAchievement", 3186712876103459676L);
        setLongField(term211989, term211989.getClass(), "totalMasterAchievement", 2148631260120813269L);
        setLongField(term211989, term211989.getClass(), "totalReMasterAchievement", 1440382768463203956L);
        setLongField(term211989, term211989.getClass(), "playerOldRating", -9211601132420767727L);
        setLongField(term211989, term211989.getClass(), "playerNewRating", 3544417781644525084L);
        setIntField(term211989, term211989.getClass(), "banState", -830429483);
        setLongField(term211989, term211989.getClass(), "dateTime", -683827499199595227L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMode", argTypes, term211989, args);
    }

};


