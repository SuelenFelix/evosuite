package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserSurvival_isNoDamage_19204433137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103779;

    public UserSurvival_isNoDamage_19204433137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103785 = new Long(146749226579788091L);
        term103779 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term103781 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term103783 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103814 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103779, term103779.getClass(), "id", 8156554915757243776L);
        setLongField(term103781, term103781.getClass(), "id", -351840430901591519L);
        setLongField(term103783, term103783.getClass(), "id", 3900637824492447206L);
        setField(term103783, term103783.getClass(), "extId", term103785);
        setField(term103783, term103783.getClass(), "luid", "ymGhnCkAFG");
        setIntField(term103800, term103800.getClass(), "year", 2025);
        setShortField(term103800, term103800.getClass(), "month", (short) 2);
        setShortField(term103800, term103800.getClass(), "day", (short) 15);
        setField(term103799, term103799.getClass(), "date", term103800);
        setByteField(term103804, term103804.getClass(), "hour", (byte) 4);
        setByteField(term103804, term103804.getClass(), "minute", (byte) 17);
        setByteField(term103804, term103804.getClass(), "second", (byte) 28);
        setIntField(term103804, term103804.getClass(), "nano", 251651317);
        setField(term103799, term103799.getClass(), "time", term103804);
        setField(term103783, term103783.getClass(), "registerTime", term103799);
        setIntField(term103810, term103810.getClass(), "year", 2011);
        setShortField(term103810, term103810.getClass(), "month", (short) 7);
        setShortField(term103810, term103810.getClass(), "day", (short) 19);
        setField(term103809, term103809.getClass(), "date", term103810);
        setByteField(term103814, term103814.getClass(), "hour", (byte) 13);
        setByteField(term103814, term103814.getClass(), "minute", (byte) 52);
        setByteField(term103814, term103814.getClass(), "second", (byte) 13);
        setIntField(term103814, term103814.getClass(), "nano", 952032021);
        setField(term103809, term103809.getClass(), "time", term103814);
        setField(term103783, term103783.getClass(), "accessTime", term103809);
        setField(term103781, term103781.getClass(), "card", term103783);
        setIntField(term103781, term103781.getClass(), "lastDataVersion", -106074389);
        setField(term103781, term103781.getClass(), "userName", "JYQEoThPjD");
        setIntField(term103781, term103781.getClass(), "point", 1750571132);
        setIntField(term103781, term103781.getClass(), "totalPoint", 590753141);
        setIntField(term103781, term103781.getClass(), "iconId", 750364664);
        setIntField(term103781, term103781.getClass(), "nameplateId", -762712240);
        setIntField(term103781, term103781.getClass(), "frameId", 437727883);
        setIntField(term103781, term103781.getClass(), "trophyId", 362508069);
        setIntField(term103781, term103781.getClass(), "playCount", 1363722184);
        setIntField(term103781, term103781.getClass(), "playVsCount", -35490007);
        setIntField(term103781, term103781.getClass(), "playSyncCount", -283472712);
        setIntField(term103781, term103781.getClass(), "winCount", 2086485920);
        setIntField(term103781, term103781.getClass(), "helpCount", -844733146);
        setIntField(term103781, term103781.getClass(), "comboCount", 844968617);
        setIntField(term103781, term103781.getClass(), "feverCount", 1715915962);
        setIntField(term103781, term103781.getClass(), "totalHiScore", -1131069791);
        setIntField(term103781, term103781.getClass(), "totalEasyHighScore", 1323940733);
        setIntField(term103781, term103781.getClass(), "totalBasicHighScore", -293767776);
        setIntField(term103781, term103781.getClass(), "totalAdvancedHighScore", -340181571);
        setIntField(term103781, term103781.getClass(), "totalExpertHighScore", 1150709730);
        setIntField(term103781, term103781.getClass(), "totalMasterHighScore", -935342742);
        setIntField(term103781, term103781.getClass(), "totalReMasterHighScore", -1343188975);
        setIntField(term103781, term103781.getClass(), "totalHighSync", -1142240411);
        setIntField(term103781, term103781.getClass(), "totalEasySync", 37630929);
        setIntField(term103781, term103781.getClass(), "totalBasicSync", -255383207);
        setIntField(term103781, term103781.getClass(), "totalAdvancedSync", 2012928001);
        setIntField(term103781, term103781.getClass(), "totalExpertSync", 610380050);
        setIntField(term103781, term103781.getClass(), "totalMasterSync", -1248880765);
        setIntField(term103781, term103781.getClass(), "totalReMasterSync", 1182147696);
        setIntField(term103781, term103781.getClass(), "playerRating", 1238039697);
        setIntField(term103781, term103781.getClass(), "highestRating", 406825318);
        setIntField(term103781, term103781.getClass(), "rankAuthTailId", 966733800);
        setField(term103781, term103781.getClass(), "eventWatchedDate", "uUYeaeRaCx");
        setField(term103781, term103781.getClass(), "webLimitDate", "oCpxzVdxcV");
        setIntField(term103781, term103781.getClass(), "challengeTrackPhase", 761784235);
        setIntField(term103781, term103781.getClass(), "firstPlayBits", 222754383);
        setField(term103781, term103781.getClass(), "lastPlayDate", "PzNtQwCbTD");
        setIntField(term103781, term103781.getClass(), "lastPlaceId", 1189087747);
        setField(term103781, term103781.getClass(), "lastPlaceName", "wQAefimNLh");
        setIntField(term103781, term103781.getClass(), "lastRegionId", -1148914624);
        setField(term103781, term103781.getClass(), "lastRegionName", "NDFbtxRRgi");
        setField(term103781, term103781.getClass(), "lastClientId", "vasBXGWtux");
        setField(term103781, term103781.getClass(), "lastCountryCode", "UfUIICYJWk");
        setIntField(term103781, term103781.getClass(), "eventPoint", -1710576825);
        setIntField(term103781, term103781.getClass(), "totalLv", 105326792);
        setIntField(term103781, term103781.getClass(), "lastLoginBonusDay", 1285535641);
        setIntField(term103781, term103781.getClass(), "lastSurvivalBonusDay", -1737700402);
        setIntField(term103781, term103781.getClass(), "loginBonusLv", 929809508);
        setField(term103779, term103779.getClass(), "user", term103781);
        setIntField(term103779, term103779.getClass(), "survivalId", 1114212705);
        setIntField(term103779, term103779.getClass(), "totalScore", -837333473);
        setIntField(term103779, term103779.getClass(), "totalAchieve", 1211482826);
        setBooleanField(term103779, term103779.getClass(), "isClear", false);
        setBooleanField(term103779, term103779.getClass(), "isNoDamage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNoDamage", argTypes, term103779, args);
    }

};


