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

public class UserDetail_getTotalReMasterAchievement_936647700232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290121;

    public UserDetail_getTotalReMasterAchievement_936647700232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290121 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290121, term290121.getClass(), "id", 0L);
        setField(term290121, term290121.getClass(), "card", null);
        setField(term290121, term290121.getClass(), "userName", null);
        setIntField(term290121, term290121.getClass(), "isNetMember", 0);
        setIntField(term290121, term290121.getClass(), "iconId", 0);
        setIntField(term290121, term290121.getClass(), "plateId", 0);
        setIntField(term290121, term290121.getClass(), "titleId", 0);
        setIntField(term290121, term290121.getClass(), "partnerId", 0);
        setIntField(term290121, term290121.getClass(), "frameId", 0);
        setIntField(term290121, term290121.getClass(), "selectMapId", 0);
        setIntField(term290121, term290121.getClass(), "totalAwake", 0);
        setIntField(term290121, term290121.getClass(), "gradeRating", 0);
        setIntField(term290121, term290121.getClass(), "musicRating", 0);
        setIntField(term290121, term290121.getClass(), "playerRating", 0);
        setIntField(term290121, term290121.getClass(), "highestRating", 0);
        setIntField(term290121, term290121.getClass(), "gradeRank", 0);
        setIntField(term290121, term290121.getClass(), "classRank", 0);
        setIntField(term290121, term290121.getClass(), "courseRank", 0);
        setField(term290121, term290121.getClass(), "charaSlot", null);
        setField(term290121, term290121.getClass(), "charaLockSlot", null);
        setLongField(term290121, term290121.getClass(), "contentBit", 0L);
        setIntField(term290121, term290121.getClass(), "playCount", 0);
        setField(term290121, term290121.getClass(), "eventWatchedDate", null);
        setField(term290121, term290121.getClass(), "lastGameId", null);
        setField(term290121, term290121.getClass(), "lastRomVersion", null);
        setField(term290121, term290121.getClass(), "lastDataVersion", null);
        setField(term290121, term290121.getClass(), "lastLoginDate", null);
        setField(term290121, term290121.getClass(), "lastPlayDate", null);
        setIntField(term290121, term290121.getClass(), "lastPlayCredit", 0);
        setIntField(term290121, term290121.getClass(), "lastPlayMode", 0);
        setIntField(term290121, term290121.getClass(), "lastPlaceId", 0);
        setField(term290121, term290121.getClass(), "lastPlaceName", null);
        setIntField(term290121, term290121.getClass(), "lastAllNetId", 0);
        setIntField(term290121, term290121.getClass(), "lastRegionId", 0);
        setField(term290121, term290121.getClass(), "lastRegionName", null);
        setField(term290121, term290121.getClass(), "lastClientId", null);
        setField(term290121, term290121.getClass(), "lastCountryCode", null);
        setIntField(term290121, term290121.getClass(), "lastSelectEMoney", 0);
        setIntField(term290121, term290121.getClass(), "lastSelectTicket", 0);
        setIntField(term290121, term290121.getClass(), "lastSelectCourse", 0);
        setIntField(term290121, term290121.getClass(), "lastCountCourse", 0);
        setField(term290121, term290121.getClass(), "firstGameId", null);
        setField(term290121, term290121.getClass(), "firstRomVersion", null);
        setField(term290121, term290121.getClass(), "firstDataVersion", null);
        setField(term290121, term290121.getClass(), "firstPlayDate", null);
        setField(term290121, term290121.getClass(), "compatibleCmVersion", null);
        setField(term290121, term290121.getClass(), "dailyBonusDate", null);
        setField(term290121, term290121.getClass(), "dailyCourseBonusDate", null);
        setField(term290121, term290121.getClass(), "lastPairLoginDate", null);
        setField(term290121, term290121.getClass(), "lastTrialPlayDate", null);
        setIntField(term290121, term290121.getClass(), "playVsCount", 0);
        setIntField(term290121, term290121.getClass(), "playSyncCount", 0);
        setIntField(term290121, term290121.getClass(), "winCount", 0);
        setIntField(term290121, term290121.getClass(), "helpCount", 0);
        setIntField(term290121, term290121.getClass(), "comboCount", 0);
        setLongField(term290121, term290121.getClass(), "totalDeluxscore", 0L);
        setLongField(term290121, term290121.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290121, term290121.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290121, term290121.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290121, term290121.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290121, term290121.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290121, term290121.getClass(), "totalSync", 0);
        setIntField(term290121, term290121.getClass(), "totalBasicSync", 0);
        setIntField(term290121, term290121.getClass(), "totalAdvancedSync", 0);
        setIntField(term290121, term290121.getClass(), "totalExpertSync", 0);
        setIntField(term290121, term290121.getClass(), "totalMasterSync", 0);
        setIntField(term290121, term290121.getClass(), "totalReMasterSync", 0);
        setLongField(term290121, term290121.getClass(), "totalAchievement", 0L);
        setLongField(term290121, term290121.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290121, term290121.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290121, term290121.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290121, term290121.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290121, term290121.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290121, term290121.getClass(), "playerOldRating", 0L);
        setLongField(term290121, term290121.getClass(), "playerNewRating", 0L);
        setIntField(term290121, term290121.getClass(), "banState", 0);
        setLongField(term290121, term290121.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterAchievement", argTypes, term290121, args);
    }

};


