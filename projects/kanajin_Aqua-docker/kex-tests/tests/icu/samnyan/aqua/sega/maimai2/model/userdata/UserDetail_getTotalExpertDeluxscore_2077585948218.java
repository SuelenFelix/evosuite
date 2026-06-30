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

public class UserDetail_getTotalExpertDeluxscore_2077585948218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289351;

    public UserDetail_getTotalExpertDeluxscore_2077585948218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289351 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289351, term289351.getClass(), "id", 0L);
        setField(term289351, term289351.getClass(), "card", null);
        setField(term289351, term289351.getClass(), "userName", null);
        setIntField(term289351, term289351.getClass(), "isNetMember", 0);
        setIntField(term289351, term289351.getClass(), "iconId", 0);
        setIntField(term289351, term289351.getClass(), "plateId", 0);
        setIntField(term289351, term289351.getClass(), "titleId", 0);
        setIntField(term289351, term289351.getClass(), "partnerId", 0);
        setIntField(term289351, term289351.getClass(), "frameId", 0);
        setIntField(term289351, term289351.getClass(), "selectMapId", 0);
        setIntField(term289351, term289351.getClass(), "totalAwake", 0);
        setIntField(term289351, term289351.getClass(), "gradeRating", 0);
        setIntField(term289351, term289351.getClass(), "musicRating", 0);
        setIntField(term289351, term289351.getClass(), "playerRating", 0);
        setIntField(term289351, term289351.getClass(), "highestRating", 0);
        setIntField(term289351, term289351.getClass(), "gradeRank", 0);
        setIntField(term289351, term289351.getClass(), "classRank", 0);
        setIntField(term289351, term289351.getClass(), "courseRank", 0);
        setField(term289351, term289351.getClass(), "charaSlot", null);
        setField(term289351, term289351.getClass(), "charaLockSlot", null);
        setLongField(term289351, term289351.getClass(), "contentBit", 0L);
        setIntField(term289351, term289351.getClass(), "playCount", 0);
        setField(term289351, term289351.getClass(), "eventWatchedDate", null);
        setField(term289351, term289351.getClass(), "lastGameId", null);
        setField(term289351, term289351.getClass(), "lastRomVersion", null);
        setField(term289351, term289351.getClass(), "lastDataVersion", null);
        setField(term289351, term289351.getClass(), "lastLoginDate", null);
        setField(term289351, term289351.getClass(), "lastPlayDate", null);
        setIntField(term289351, term289351.getClass(), "lastPlayCredit", 0);
        setIntField(term289351, term289351.getClass(), "lastPlayMode", 0);
        setIntField(term289351, term289351.getClass(), "lastPlaceId", 0);
        setField(term289351, term289351.getClass(), "lastPlaceName", null);
        setIntField(term289351, term289351.getClass(), "lastAllNetId", 0);
        setIntField(term289351, term289351.getClass(), "lastRegionId", 0);
        setField(term289351, term289351.getClass(), "lastRegionName", null);
        setField(term289351, term289351.getClass(), "lastClientId", null);
        setField(term289351, term289351.getClass(), "lastCountryCode", null);
        setIntField(term289351, term289351.getClass(), "lastSelectEMoney", 0);
        setIntField(term289351, term289351.getClass(), "lastSelectTicket", 0);
        setIntField(term289351, term289351.getClass(), "lastSelectCourse", 0);
        setIntField(term289351, term289351.getClass(), "lastCountCourse", 0);
        setField(term289351, term289351.getClass(), "firstGameId", null);
        setField(term289351, term289351.getClass(), "firstRomVersion", null);
        setField(term289351, term289351.getClass(), "firstDataVersion", null);
        setField(term289351, term289351.getClass(), "firstPlayDate", null);
        setField(term289351, term289351.getClass(), "compatibleCmVersion", null);
        setField(term289351, term289351.getClass(), "dailyBonusDate", null);
        setField(term289351, term289351.getClass(), "dailyCourseBonusDate", null);
        setField(term289351, term289351.getClass(), "lastPairLoginDate", null);
        setField(term289351, term289351.getClass(), "lastTrialPlayDate", null);
        setIntField(term289351, term289351.getClass(), "playVsCount", 0);
        setIntField(term289351, term289351.getClass(), "playSyncCount", 0);
        setIntField(term289351, term289351.getClass(), "winCount", 0);
        setIntField(term289351, term289351.getClass(), "helpCount", 0);
        setIntField(term289351, term289351.getClass(), "comboCount", 0);
        setLongField(term289351, term289351.getClass(), "totalDeluxscore", 0L);
        setLongField(term289351, term289351.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289351, term289351.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289351, term289351.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289351, term289351.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289351, term289351.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289351, term289351.getClass(), "totalSync", 0);
        setIntField(term289351, term289351.getClass(), "totalBasicSync", 0);
        setIntField(term289351, term289351.getClass(), "totalAdvancedSync", 0);
        setIntField(term289351, term289351.getClass(), "totalExpertSync", 0);
        setIntField(term289351, term289351.getClass(), "totalMasterSync", 0);
        setIntField(term289351, term289351.getClass(), "totalReMasterSync", 0);
        setLongField(term289351, term289351.getClass(), "totalAchievement", 0L);
        setLongField(term289351, term289351.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289351, term289351.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289351, term289351.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289351, term289351.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289351, term289351.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289351, term289351.getClass(), "playerOldRating", 0L);
        setLongField(term289351, term289351.getClass(), "playerNewRating", 0L);
        setIntField(term289351, term289351.getClass(), "banState", 0);
        setLongField(term289351, term289351.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertDeluxscore", argTypes, term289351, args);
    }

};


