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
import java.lang.Integer;

public class UserData_setLastLoginBonusDay_3926986997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25907;
     Object term26081;

    public UserData_setLastLoginBonusDay_3926986997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25911 = new Long(1672578078364590450L);
        term25907 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term25909 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25930 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25940 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25907, term25907.getClass(), "id", 8863790908271299748L);
        setLongField(term25909, term25909.getClass(), "id", 9205327385733285058L);
        setField(term25909, term25909.getClass(), "extId", term25911);
        setField(term25909, term25909.getClass(), "luid", "uuSYOUCVHU");
        setIntField(term25926, term25926.getClass(), "year", 2016);
        setShortField(term25926, term25926.getClass(), "month", (short) 11);
        setShortField(term25926, term25926.getClass(), "day", (short) 20);
        setField(term25925, term25925.getClass(), "date", term25926);
        setByteField(term25930, term25930.getClass(), "hour", (byte) 17);
        setByteField(term25930, term25930.getClass(), "minute", (byte) 20);
        setByteField(term25930, term25930.getClass(), "second", (byte) 21);
        setIntField(term25930, term25930.getClass(), "nano", 340096364);
        setField(term25925, term25925.getClass(), "time", term25930);
        setField(term25909, term25909.getClass(), "registerTime", term25925);
        setIntField(term25936, term25936.getClass(), "year", 2024);
        setShortField(term25936, term25936.getClass(), "month", (short) 10);
        setShortField(term25936, term25936.getClass(), "day", (short) 28);
        setField(term25935, term25935.getClass(), "date", term25936);
        setByteField(term25940, term25940.getClass(), "hour", (byte) 5);
        setByteField(term25940, term25940.getClass(), "minute", (byte) 13);
        setByteField(term25940, term25940.getClass(), "second", (byte) 51);
        setIntField(term25940, term25940.getClass(), "nano", 605693001);
        setField(term25935, term25935.getClass(), "time", term25940);
        setField(term25909, term25909.getClass(), "accessTime", term25935);
        setField(term25907, term25907.getClass(), "card", term25909);
        setIntField(term25907, term25907.getClass(), "lastDataVersion", 2030509680);
        setField(term25907, term25907.getClass(), "userName", "DfWwbodtVw");
        setIntField(term25907, term25907.getClass(), "point", -927217294);
        setIntField(term25907, term25907.getClass(), "totalPoint", -157082836);
        setIntField(term25907, term25907.getClass(), "iconId", 1665464572);
        setIntField(term25907, term25907.getClass(), "nameplateId", -685125586);
        setIntField(term25907, term25907.getClass(), "frameId", 708362673);
        setIntField(term25907, term25907.getClass(), "trophyId", -630444357);
        setIntField(term25907, term25907.getClass(), "playCount", 936421624);
        setIntField(term25907, term25907.getClass(), "playVsCount", -616512894);
        setIntField(term25907, term25907.getClass(), "playSyncCount", 710841913);
        setIntField(term25907, term25907.getClass(), "winCount", 293875732);
        setIntField(term25907, term25907.getClass(), "helpCount", -375636222);
        setIntField(term25907, term25907.getClass(), "comboCount", 2019131833);
        setIntField(term25907, term25907.getClass(), "feverCount", -2057057319);
        setIntField(term25907, term25907.getClass(), "totalHiScore", -872007840);
        setIntField(term25907, term25907.getClass(), "totalEasyHighScore", 614977875);
        setIntField(term25907, term25907.getClass(), "totalBasicHighScore", -424672642);
        setIntField(term25907, term25907.getClass(), "totalAdvancedHighScore", -1836107736);
        setIntField(term25907, term25907.getClass(), "totalExpertHighScore", 1774306588);
        setIntField(term25907, term25907.getClass(), "totalMasterHighScore", 897867869);
        setIntField(term25907, term25907.getClass(), "totalReMasterHighScore", -1058380964);
        setIntField(term25907, term25907.getClass(), "totalHighSync", 1144389305);
        setIntField(term25907, term25907.getClass(), "totalEasySync", 785140032);
        setIntField(term25907, term25907.getClass(), "totalBasicSync", 2011478303);
        setIntField(term25907, term25907.getClass(), "totalAdvancedSync", -1064254847);
        setIntField(term25907, term25907.getClass(), "totalExpertSync", 427797900);
        setIntField(term25907, term25907.getClass(), "totalMasterSync", 948009124);
        setIntField(term25907, term25907.getClass(), "totalReMasterSync", 1688840379);
        setIntField(term25907, term25907.getClass(), "playerRating", -1811534908);
        setIntField(term25907, term25907.getClass(), "highestRating", -1024774970);
        setIntField(term25907, term25907.getClass(), "rankAuthTailId", 191435935);
        setField(term25907, term25907.getClass(), "eventWatchedDate", "kTbFMpVWqx");
        setField(term25907, term25907.getClass(), "webLimitDate", "HegRNsidFg");
        setIntField(term25907, term25907.getClass(), "challengeTrackPhase", -1320856251);
        setIntField(term25907, term25907.getClass(), "firstPlayBits", 957604584);
        setField(term25907, term25907.getClass(), "lastPlayDate", "udRdJkgXmH");
        setIntField(term25907, term25907.getClass(), "lastPlaceId", 1124496804);
        setField(term25907, term25907.getClass(), "lastPlaceName", "FBCXbjHVXO");
        setIntField(term25907, term25907.getClass(), "lastRegionId", -792786703);
        setField(term25907, term25907.getClass(), "lastRegionName", "dIWAnvmLiC");
        setField(term25907, term25907.getClass(), "lastClientId", "CuWebzZQjZ");
        setField(term25907, term25907.getClass(), "lastCountryCode", "wRVaaJxKYI");
        setIntField(term25907, term25907.getClass(), "eventPoint", 331010013);
        setIntField(term25907, term25907.getClass(), "totalLv", 275287586);
        setIntField(term25907, term25907.getClass(), "lastLoginBonusDay", 628507821);
        setIntField(term25907, term25907.getClass(), "lastSurvivalBonusDay", 247792610);
        setIntField(term25907, term25907.getClass(), "loginBonusLv", -2059652097);
        term26081 = new Integer(75564248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26081;
        callMethod(klass, "setLastLoginBonusDay", argTypes, term25907, args);
    }

};


