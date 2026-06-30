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

public class UserSurvival_setSurvivalId_124843527010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104858;
     Object term105039;

    public UserSurvival_setSurvivalId_124843527010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104864 = new Long(-9147545274054597570L);
        term104858 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term104860 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term104862 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term104878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104883 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104893 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104858, term104858.getClass(), "id", 6637550433135455885L);
        setLongField(term104860, term104860.getClass(), "id", -5562622835440119601L);
        setLongField(term104862, term104862.getClass(), "id", 493485007607912369L);
        setField(term104862, term104862.getClass(), "extId", term104864);
        setField(term104862, term104862.getClass(), "luid", "jgPUpbSRNf");
        setIntField(term104879, term104879.getClass(), "year", 2022);
        setShortField(term104879, term104879.getClass(), "month", (short) 8);
        setShortField(term104879, term104879.getClass(), "day", (short) 26);
        setField(term104878, term104878.getClass(), "date", term104879);
        setByteField(term104883, term104883.getClass(), "hour", (byte) 20);
        setByteField(term104883, term104883.getClass(), "minute", (byte) 26);
        setByteField(term104883, term104883.getClass(), "second", (byte) 55);
        setIntField(term104883, term104883.getClass(), "nano", 380890210);
        setField(term104878, term104878.getClass(), "time", term104883);
        setField(term104862, term104862.getClass(), "registerTime", term104878);
        setIntField(term104889, term104889.getClass(), "year", 2010);
        setShortField(term104889, term104889.getClass(), "month", (short) 6);
        setShortField(term104889, term104889.getClass(), "day", (short) 21);
        setField(term104888, term104888.getClass(), "date", term104889);
        setByteField(term104893, term104893.getClass(), "hour", (byte) 4);
        setByteField(term104893, term104893.getClass(), "minute", (byte) 6);
        setByteField(term104893, term104893.getClass(), "second", (byte) 54);
        setIntField(term104893, term104893.getClass(), "nano", 837855935);
        setField(term104888, term104888.getClass(), "time", term104893);
        setField(term104862, term104862.getClass(), "accessTime", term104888);
        setField(term104860, term104860.getClass(), "card", term104862);
        setIntField(term104860, term104860.getClass(), "lastDataVersion", 388729923);
        setField(term104860, term104860.getClass(), "userName", "GHKReaUGqB");
        setIntField(term104860, term104860.getClass(), "point", 1614487902);
        setIntField(term104860, term104860.getClass(), "totalPoint", 965606955);
        setIntField(term104860, term104860.getClass(), "iconId", 427189621);
        setIntField(term104860, term104860.getClass(), "nameplateId", -1146650520);
        setIntField(term104860, term104860.getClass(), "frameId", 308747026);
        setIntField(term104860, term104860.getClass(), "trophyId", -1142598830);
        setIntField(term104860, term104860.getClass(), "playCount", 422197241);
        setIntField(term104860, term104860.getClass(), "playVsCount", 512839329);
        setIntField(term104860, term104860.getClass(), "playSyncCount", -1308727775);
        setIntField(term104860, term104860.getClass(), "winCount", 923435355);
        setIntField(term104860, term104860.getClass(), "helpCount", 529707862);
        setIntField(term104860, term104860.getClass(), "comboCount", 1163541549);
        setIntField(term104860, term104860.getClass(), "feverCount", 85255563);
        setIntField(term104860, term104860.getClass(), "totalHiScore", 1698224861);
        setIntField(term104860, term104860.getClass(), "totalEasyHighScore", -1675006092);
        setIntField(term104860, term104860.getClass(), "totalBasicHighScore", -71395930);
        setIntField(term104860, term104860.getClass(), "totalAdvancedHighScore", -1327988712);
        setIntField(term104860, term104860.getClass(), "totalExpertHighScore", -481078842);
        setIntField(term104860, term104860.getClass(), "totalMasterHighScore", 133257591);
        setIntField(term104860, term104860.getClass(), "totalReMasterHighScore", -171155321);
        setIntField(term104860, term104860.getClass(), "totalHighSync", -677950072);
        setIntField(term104860, term104860.getClass(), "totalEasySync", -904761728);
        setIntField(term104860, term104860.getClass(), "totalBasicSync", 2000897549);
        setIntField(term104860, term104860.getClass(), "totalAdvancedSync", 1826955502);
        setIntField(term104860, term104860.getClass(), "totalExpertSync", -757144818);
        setIntField(term104860, term104860.getClass(), "totalMasterSync", 519574863);
        setIntField(term104860, term104860.getClass(), "totalReMasterSync", 1696650503);
        setIntField(term104860, term104860.getClass(), "playerRating", 1324332962);
        setIntField(term104860, term104860.getClass(), "highestRating", 1021276927);
        setIntField(term104860, term104860.getClass(), "rankAuthTailId", 871349756);
        setField(term104860, term104860.getClass(), "eventWatchedDate", "oWFgLqbhiK");
        setField(term104860, term104860.getClass(), "webLimitDate", "gyLdvdOJQs");
        setIntField(term104860, term104860.getClass(), "challengeTrackPhase", -543589845);
        setIntField(term104860, term104860.getClass(), "firstPlayBits", -423912362);
        setField(term104860, term104860.getClass(), "lastPlayDate", "PASAYkwcOc");
        setIntField(term104860, term104860.getClass(), "lastPlaceId", 2008331206);
        setField(term104860, term104860.getClass(), "lastPlaceName", "aeiojdusXr");
        setIntField(term104860, term104860.getClass(), "lastRegionId", 1103626679);
        setField(term104860, term104860.getClass(), "lastRegionName", "KKgjZsGDBV");
        setField(term104860, term104860.getClass(), "lastClientId", "EkIjtjomYk");
        setField(term104860, term104860.getClass(), "lastCountryCode", "ZOUuaTJRXe");
        setIntField(term104860, term104860.getClass(), "eventPoint", 154582855);
        setIntField(term104860, term104860.getClass(), "totalLv", 2095511598);
        setIntField(term104860, term104860.getClass(), "lastLoginBonusDay", -723402213);
        setIntField(term104860, term104860.getClass(), "lastSurvivalBonusDay", 622633785);
        setIntField(term104860, term104860.getClass(), "loginBonusLv", -2061364343);
        setField(term104858, term104858.getClass(), "user", term104860);
        setIntField(term104858, term104858.getClass(), "survivalId", 1437426819);
        setIntField(term104858, term104858.getClass(), "totalScore", 980185716);
        setIntField(term104858, term104858.getClass(), "totalAchieve", -451513047);
        setBooleanField(term104858, term104858.getClass(), "isClear", true);
        setBooleanField(term104858, term104858.getClass(), "isNoDamage", true);
        term105039 = new Integer(1544010766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105039;
        callMethod(klass, "setSurvivalId", argTypes, term104858, args);
    }

};


