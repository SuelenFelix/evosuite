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

public class UserDetail_getPlaySyncCount_385229294211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288966;

    public UserDetail_getPlaySyncCount_385229294211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288966 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288966, term288966.getClass(), "id", 0L);
        setField(term288966, term288966.getClass(), "card", null);
        setField(term288966, term288966.getClass(), "userName", null);
        setIntField(term288966, term288966.getClass(), "isNetMember", 0);
        setIntField(term288966, term288966.getClass(), "iconId", 0);
        setIntField(term288966, term288966.getClass(), "plateId", 0);
        setIntField(term288966, term288966.getClass(), "titleId", 0);
        setIntField(term288966, term288966.getClass(), "partnerId", 0);
        setIntField(term288966, term288966.getClass(), "frameId", 0);
        setIntField(term288966, term288966.getClass(), "selectMapId", 0);
        setIntField(term288966, term288966.getClass(), "totalAwake", 0);
        setIntField(term288966, term288966.getClass(), "gradeRating", 0);
        setIntField(term288966, term288966.getClass(), "musicRating", 0);
        setIntField(term288966, term288966.getClass(), "playerRating", 0);
        setIntField(term288966, term288966.getClass(), "highestRating", 0);
        setIntField(term288966, term288966.getClass(), "gradeRank", 0);
        setIntField(term288966, term288966.getClass(), "classRank", 0);
        setIntField(term288966, term288966.getClass(), "courseRank", 0);
        setField(term288966, term288966.getClass(), "charaSlot", null);
        setField(term288966, term288966.getClass(), "charaLockSlot", null);
        setLongField(term288966, term288966.getClass(), "contentBit", 0L);
        setIntField(term288966, term288966.getClass(), "playCount", 0);
        setField(term288966, term288966.getClass(), "eventWatchedDate", null);
        setField(term288966, term288966.getClass(), "lastGameId", null);
        setField(term288966, term288966.getClass(), "lastRomVersion", null);
        setField(term288966, term288966.getClass(), "lastDataVersion", null);
        setField(term288966, term288966.getClass(), "lastLoginDate", null);
        setField(term288966, term288966.getClass(), "lastPlayDate", null);
        setIntField(term288966, term288966.getClass(), "lastPlayCredit", 0);
        setIntField(term288966, term288966.getClass(), "lastPlayMode", 0);
        setIntField(term288966, term288966.getClass(), "lastPlaceId", 0);
        setField(term288966, term288966.getClass(), "lastPlaceName", null);
        setIntField(term288966, term288966.getClass(), "lastAllNetId", 0);
        setIntField(term288966, term288966.getClass(), "lastRegionId", 0);
        setField(term288966, term288966.getClass(), "lastRegionName", null);
        setField(term288966, term288966.getClass(), "lastClientId", null);
        setField(term288966, term288966.getClass(), "lastCountryCode", null);
        setIntField(term288966, term288966.getClass(), "lastSelectEMoney", 0);
        setIntField(term288966, term288966.getClass(), "lastSelectTicket", 0);
        setIntField(term288966, term288966.getClass(), "lastSelectCourse", 0);
        setIntField(term288966, term288966.getClass(), "lastCountCourse", 0);
        setField(term288966, term288966.getClass(), "firstGameId", null);
        setField(term288966, term288966.getClass(), "firstRomVersion", null);
        setField(term288966, term288966.getClass(), "firstDataVersion", null);
        setField(term288966, term288966.getClass(), "firstPlayDate", null);
        setField(term288966, term288966.getClass(), "compatibleCmVersion", null);
        setField(term288966, term288966.getClass(), "dailyBonusDate", null);
        setField(term288966, term288966.getClass(), "dailyCourseBonusDate", null);
        setField(term288966, term288966.getClass(), "lastPairLoginDate", null);
        setField(term288966, term288966.getClass(), "lastTrialPlayDate", null);
        setIntField(term288966, term288966.getClass(), "playVsCount", 0);
        setIntField(term288966, term288966.getClass(), "playSyncCount", 0);
        setIntField(term288966, term288966.getClass(), "winCount", 0);
        setIntField(term288966, term288966.getClass(), "helpCount", 0);
        setIntField(term288966, term288966.getClass(), "comboCount", 0);
        setLongField(term288966, term288966.getClass(), "totalDeluxscore", 0L);
        setLongField(term288966, term288966.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288966, term288966.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288966, term288966.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288966, term288966.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288966, term288966.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288966, term288966.getClass(), "totalSync", 0);
        setIntField(term288966, term288966.getClass(), "totalBasicSync", 0);
        setIntField(term288966, term288966.getClass(), "totalAdvancedSync", 0);
        setIntField(term288966, term288966.getClass(), "totalExpertSync", 0);
        setIntField(term288966, term288966.getClass(), "totalMasterSync", 0);
        setIntField(term288966, term288966.getClass(), "totalReMasterSync", 0);
        setLongField(term288966, term288966.getClass(), "totalAchievement", 0L);
        setLongField(term288966, term288966.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288966, term288966.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288966, term288966.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288966, term288966.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288966, term288966.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288966, term288966.getClass(), "playerOldRating", 0L);
        setLongField(term288966, term288966.getClass(), "playerNewRating", 0L);
        setIntField(term288966, term288966.getClass(), "banState", 0);
        setLongField(term288966, term288966.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaySyncCount", argTypes, term288966, args);
    }

};


