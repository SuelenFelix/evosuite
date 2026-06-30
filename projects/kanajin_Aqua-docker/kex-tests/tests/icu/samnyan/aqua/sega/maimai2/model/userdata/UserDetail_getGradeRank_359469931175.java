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

public class UserDetail_getGradeRank_359469931175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286986;

    public UserDetail_getGradeRank_359469931175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286986 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286986, term286986.getClass(), "id", 0L);
        setField(term286986, term286986.getClass(), "card", null);
        setField(term286986, term286986.getClass(), "userName", null);
        setIntField(term286986, term286986.getClass(), "isNetMember", 0);
        setIntField(term286986, term286986.getClass(), "iconId", 0);
        setIntField(term286986, term286986.getClass(), "plateId", 0);
        setIntField(term286986, term286986.getClass(), "titleId", 0);
        setIntField(term286986, term286986.getClass(), "partnerId", 0);
        setIntField(term286986, term286986.getClass(), "frameId", 0);
        setIntField(term286986, term286986.getClass(), "selectMapId", 0);
        setIntField(term286986, term286986.getClass(), "totalAwake", 0);
        setIntField(term286986, term286986.getClass(), "gradeRating", 0);
        setIntField(term286986, term286986.getClass(), "musicRating", 0);
        setIntField(term286986, term286986.getClass(), "playerRating", 0);
        setIntField(term286986, term286986.getClass(), "highestRating", 0);
        setIntField(term286986, term286986.getClass(), "gradeRank", 0);
        setIntField(term286986, term286986.getClass(), "classRank", 0);
        setIntField(term286986, term286986.getClass(), "courseRank", 0);
        setField(term286986, term286986.getClass(), "charaSlot", null);
        setField(term286986, term286986.getClass(), "charaLockSlot", null);
        setLongField(term286986, term286986.getClass(), "contentBit", 0L);
        setIntField(term286986, term286986.getClass(), "playCount", 0);
        setField(term286986, term286986.getClass(), "eventWatchedDate", null);
        setField(term286986, term286986.getClass(), "lastGameId", null);
        setField(term286986, term286986.getClass(), "lastRomVersion", null);
        setField(term286986, term286986.getClass(), "lastDataVersion", null);
        setField(term286986, term286986.getClass(), "lastLoginDate", null);
        setField(term286986, term286986.getClass(), "lastPlayDate", null);
        setIntField(term286986, term286986.getClass(), "lastPlayCredit", 0);
        setIntField(term286986, term286986.getClass(), "lastPlayMode", 0);
        setIntField(term286986, term286986.getClass(), "lastPlaceId", 0);
        setField(term286986, term286986.getClass(), "lastPlaceName", null);
        setIntField(term286986, term286986.getClass(), "lastAllNetId", 0);
        setIntField(term286986, term286986.getClass(), "lastRegionId", 0);
        setField(term286986, term286986.getClass(), "lastRegionName", null);
        setField(term286986, term286986.getClass(), "lastClientId", null);
        setField(term286986, term286986.getClass(), "lastCountryCode", null);
        setIntField(term286986, term286986.getClass(), "lastSelectEMoney", 0);
        setIntField(term286986, term286986.getClass(), "lastSelectTicket", 0);
        setIntField(term286986, term286986.getClass(), "lastSelectCourse", 0);
        setIntField(term286986, term286986.getClass(), "lastCountCourse", 0);
        setField(term286986, term286986.getClass(), "firstGameId", null);
        setField(term286986, term286986.getClass(), "firstRomVersion", null);
        setField(term286986, term286986.getClass(), "firstDataVersion", null);
        setField(term286986, term286986.getClass(), "firstPlayDate", null);
        setField(term286986, term286986.getClass(), "compatibleCmVersion", null);
        setField(term286986, term286986.getClass(), "dailyBonusDate", null);
        setField(term286986, term286986.getClass(), "dailyCourseBonusDate", null);
        setField(term286986, term286986.getClass(), "lastPairLoginDate", null);
        setField(term286986, term286986.getClass(), "lastTrialPlayDate", null);
        setIntField(term286986, term286986.getClass(), "playVsCount", 0);
        setIntField(term286986, term286986.getClass(), "playSyncCount", 0);
        setIntField(term286986, term286986.getClass(), "winCount", 0);
        setIntField(term286986, term286986.getClass(), "helpCount", 0);
        setIntField(term286986, term286986.getClass(), "comboCount", 0);
        setLongField(term286986, term286986.getClass(), "totalDeluxscore", 0L);
        setLongField(term286986, term286986.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286986, term286986.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286986, term286986.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286986, term286986.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286986, term286986.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286986, term286986.getClass(), "totalSync", 0);
        setIntField(term286986, term286986.getClass(), "totalBasicSync", 0);
        setIntField(term286986, term286986.getClass(), "totalAdvancedSync", 0);
        setIntField(term286986, term286986.getClass(), "totalExpertSync", 0);
        setIntField(term286986, term286986.getClass(), "totalMasterSync", 0);
        setIntField(term286986, term286986.getClass(), "totalReMasterSync", 0);
        setLongField(term286986, term286986.getClass(), "totalAchievement", 0L);
        setLongField(term286986, term286986.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286986, term286986.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286986, term286986.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286986, term286986.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286986, term286986.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286986, term286986.getClass(), "playerOldRating", 0L);
        setLongField(term286986, term286986.getClass(), "playerNewRating", 0L);
        setIntField(term286986, term286986.getClass(), "banState", 0);
        setLongField(term286986, term286986.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRank", argTypes, term286986, args);
    }

};


