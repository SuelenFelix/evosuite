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

public class UserDetail_getPlayVsCount_2051695920210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288911;

    public UserDetail_getPlayVsCount_2051695920210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288911, term288911.getClass(), "id", 0L);
        setField(term288911, term288911.getClass(), "card", null);
        setField(term288911, term288911.getClass(), "userName", null);
        setIntField(term288911, term288911.getClass(), "isNetMember", 0);
        setIntField(term288911, term288911.getClass(), "iconId", 0);
        setIntField(term288911, term288911.getClass(), "plateId", 0);
        setIntField(term288911, term288911.getClass(), "titleId", 0);
        setIntField(term288911, term288911.getClass(), "partnerId", 0);
        setIntField(term288911, term288911.getClass(), "frameId", 0);
        setIntField(term288911, term288911.getClass(), "selectMapId", 0);
        setIntField(term288911, term288911.getClass(), "totalAwake", 0);
        setIntField(term288911, term288911.getClass(), "gradeRating", 0);
        setIntField(term288911, term288911.getClass(), "musicRating", 0);
        setIntField(term288911, term288911.getClass(), "playerRating", 0);
        setIntField(term288911, term288911.getClass(), "highestRating", 0);
        setIntField(term288911, term288911.getClass(), "gradeRank", 0);
        setIntField(term288911, term288911.getClass(), "classRank", 0);
        setIntField(term288911, term288911.getClass(), "courseRank", 0);
        setField(term288911, term288911.getClass(), "charaSlot", null);
        setField(term288911, term288911.getClass(), "charaLockSlot", null);
        setLongField(term288911, term288911.getClass(), "contentBit", 0L);
        setIntField(term288911, term288911.getClass(), "playCount", 0);
        setField(term288911, term288911.getClass(), "eventWatchedDate", null);
        setField(term288911, term288911.getClass(), "lastGameId", null);
        setField(term288911, term288911.getClass(), "lastRomVersion", null);
        setField(term288911, term288911.getClass(), "lastDataVersion", null);
        setField(term288911, term288911.getClass(), "lastLoginDate", null);
        setField(term288911, term288911.getClass(), "lastPlayDate", null);
        setIntField(term288911, term288911.getClass(), "lastPlayCredit", 0);
        setIntField(term288911, term288911.getClass(), "lastPlayMode", 0);
        setIntField(term288911, term288911.getClass(), "lastPlaceId", 0);
        setField(term288911, term288911.getClass(), "lastPlaceName", null);
        setIntField(term288911, term288911.getClass(), "lastAllNetId", 0);
        setIntField(term288911, term288911.getClass(), "lastRegionId", 0);
        setField(term288911, term288911.getClass(), "lastRegionName", null);
        setField(term288911, term288911.getClass(), "lastClientId", null);
        setField(term288911, term288911.getClass(), "lastCountryCode", null);
        setIntField(term288911, term288911.getClass(), "lastSelectEMoney", 0);
        setIntField(term288911, term288911.getClass(), "lastSelectTicket", 0);
        setIntField(term288911, term288911.getClass(), "lastSelectCourse", 0);
        setIntField(term288911, term288911.getClass(), "lastCountCourse", 0);
        setField(term288911, term288911.getClass(), "firstGameId", null);
        setField(term288911, term288911.getClass(), "firstRomVersion", null);
        setField(term288911, term288911.getClass(), "firstDataVersion", null);
        setField(term288911, term288911.getClass(), "firstPlayDate", null);
        setField(term288911, term288911.getClass(), "compatibleCmVersion", null);
        setField(term288911, term288911.getClass(), "dailyBonusDate", null);
        setField(term288911, term288911.getClass(), "dailyCourseBonusDate", null);
        setField(term288911, term288911.getClass(), "lastPairLoginDate", null);
        setField(term288911, term288911.getClass(), "lastTrialPlayDate", null);
        setIntField(term288911, term288911.getClass(), "playVsCount", 0);
        setIntField(term288911, term288911.getClass(), "playSyncCount", 0);
        setIntField(term288911, term288911.getClass(), "winCount", 0);
        setIntField(term288911, term288911.getClass(), "helpCount", 0);
        setIntField(term288911, term288911.getClass(), "comboCount", 0);
        setLongField(term288911, term288911.getClass(), "totalDeluxscore", 0L);
        setLongField(term288911, term288911.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288911, term288911.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288911, term288911.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288911, term288911.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288911, term288911.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288911, term288911.getClass(), "totalSync", 0);
        setIntField(term288911, term288911.getClass(), "totalBasicSync", 0);
        setIntField(term288911, term288911.getClass(), "totalAdvancedSync", 0);
        setIntField(term288911, term288911.getClass(), "totalExpertSync", 0);
        setIntField(term288911, term288911.getClass(), "totalMasterSync", 0);
        setIntField(term288911, term288911.getClass(), "totalReMasterSync", 0);
        setLongField(term288911, term288911.getClass(), "totalAchievement", 0L);
        setLongField(term288911, term288911.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288911, term288911.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288911, term288911.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288911, term288911.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288911, term288911.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288911, term288911.getClass(), "playerOldRating", 0L);
        setLongField(term288911, term288911.getClass(), "playerNewRating", 0L);
        setIntField(term288911, term288911.getClass(), "banState", 0);
        setLongField(term288911, term288911.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayVsCount", argTypes, term288911, args);
    }

};


