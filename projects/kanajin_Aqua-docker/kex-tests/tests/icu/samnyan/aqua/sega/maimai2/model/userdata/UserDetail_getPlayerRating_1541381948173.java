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

public class UserDetail_getPlayerRating_1541381948173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286876;

    public UserDetail_getPlayerRating_1541381948173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286876 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286876, term286876.getClass(), "id", 0L);
        setField(term286876, term286876.getClass(), "card", null);
        setField(term286876, term286876.getClass(), "userName", null);
        setIntField(term286876, term286876.getClass(), "isNetMember", 0);
        setIntField(term286876, term286876.getClass(), "iconId", 0);
        setIntField(term286876, term286876.getClass(), "plateId", 0);
        setIntField(term286876, term286876.getClass(), "titleId", 0);
        setIntField(term286876, term286876.getClass(), "partnerId", 0);
        setIntField(term286876, term286876.getClass(), "frameId", 0);
        setIntField(term286876, term286876.getClass(), "selectMapId", 0);
        setIntField(term286876, term286876.getClass(), "totalAwake", 0);
        setIntField(term286876, term286876.getClass(), "gradeRating", 0);
        setIntField(term286876, term286876.getClass(), "musicRating", 0);
        setIntField(term286876, term286876.getClass(), "playerRating", 0);
        setIntField(term286876, term286876.getClass(), "highestRating", 0);
        setIntField(term286876, term286876.getClass(), "gradeRank", 0);
        setIntField(term286876, term286876.getClass(), "classRank", 0);
        setIntField(term286876, term286876.getClass(), "courseRank", 0);
        setField(term286876, term286876.getClass(), "charaSlot", null);
        setField(term286876, term286876.getClass(), "charaLockSlot", null);
        setLongField(term286876, term286876.getClass(), "contentBit", 0L);
        setIntField(term286876, term286876.getClass(), "playCount", 0);
        setField(term286876, term286876.getClass(), "eventWatchedDate", null);
        setField(term286876, term286876.getClass(), "lastGameId", null);
        setField(term286876, term286876.getClass(), "lastRomVersion", null);
        setField(term286876, term286876.getClass(), "lastDataVersion", null);
        setField(term286876, term286876.getClass(), "lastLoginDate", null);
        setField(term286876, term286876.getClass(), "lastPlayDate", null);
        setIntField(term286876, term286876.getClass(), "lastPlayCredit", 0);
        setIntField(term286876, term286876.getClass(), "lastPlayMode", 0);
        setIntField(term286876, term286876.getClass(), "lastPlaceId", 0);
        setField(term286876, term286876.getClass(), "lastPlaceName", null);
        setIntField(term286876, term286876.getClass(), "lastAllNetId", 0);
        setIntField(term286876, term286876.getClass(), "lastRegionId", 0);
        setField(term286876, term286876.getClass(), "lastRegionName", null);
        setField(term286876, term286876.getClass(), "lastClientId", null);
        setField(term286876, term286876.getClass(), "lastCountryCode", null);
        setIntField(term286876, term286876.getClass(), "lastSelectEMoney", 0);
        setIntField(term286876, term286876.getClass(), "lastSelectTicket", 0);
        setIntField(term286876, term286876.getClass(), "lastSelectCourse", 0);
        setIntField(term286876, term286876.getClass(), "lastCountCourse", 0);
        setField(term286876, term286876.getClass(), "firstGameId", null);
        setField(term286876, term286876.getClass(), "firstRomVersion", null);
        setField(term286876, term286876.getClass(), "firstDataVersion", null);
        setField(term286876, term286876.getClass(), "firstPlayDate", null);
        setField(term286876, term286876.getClass(), "compatibleCmVersion", null);
        setField(term286876, term286876.getClass(), "dailyBonusDate", null);
        setField(term286876, term286876.getClass(), "dailyCourseBonusDate", null);
        setField(term286876, term286876.getClass(), "lastPairLoginDate", null);
        setField(term286876, term286876.getClass(), "lastTrialPlayDate", null);
        setIntField(term286876, term286876.getClass(), "playVsCount", 0);
        setIntField(term286876, term286876.getClass(), "playSyncCount", 0);
        setIntField(term286876, term286876.getClass(), "winCount", 0);
        setIntField(term286876, term286876.getClass(), "helpCount", 0);
        setIntField(term286876, term286876.getClass(), "comboCount", 0);
        setLongField(term286876, term286876.getClass(), "totalDeluxscore", 0L);
        setLongField(term286876, term286876.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286876, term286876.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286876, term286876.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286876, term286876.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286876, term286876.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286876, term286876.getClass(), "totalSync", 0);
        setIntField(term286876, term286876.getClass(), "totalBasicSync", 0);
        setIntField(term286876, term286876.getClass(), "totalAdvancedSync", 0);
        setIntField(term286876, term286876.getClass(), "totalExpertSync", 0);
        setIntField(term286876, term286876.getClass(), "totalMasterSync", 0);
        setIntField(term286876, term286876.getClass(), "totalReMasterSync", 0);
        setLongField(term286876, term286876.getClass(), "totalAchievement", 0L);
        setLongField(term286876, term286876.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286876, term286876.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286876, term286876.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286876, term286876.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286876, term286876.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286876, term286876.getClass(), "playerOldRating", 0L);
        setLongField(term286876, term286876.getClass(), "playerNewRating", 0L);
        setIntField(term286876, term286876.getClass(), "banState", 0);
        setLongField(term286876, term286876.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term286876, args);
    }

};


