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

public class UserDetail_hashCode_971413315316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294849;

    public UserDetail_hashCode_971413315316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294849 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294849, term294849.getClass(), "id", 0L);
        setField(term294849, term294849.getClass(), "card", null);
        setField(term294849, term294849.getClass(), "userName", null);
        setIntField(term294849, term294849.getClass(), "isNetMember", 0);
        setIntField(term294849, term294849.getClass(), "iconId", 0);
        setIntField(term294849, term294849.getClass(), "plateId", 0);
        setIntField(term294849, term294849.getClass(), "titleId", 0);
        setIntField(term294849, term294849.getClass(), "partnerId", 0);
        setIntField(term294849, term294849.getClass(), "frameId", 0);
        setIntField(term294849, term294849.getClass(), "selectMapId", 0);
        setIntField(term294849, term294849.getClass(), "totalAwake", 0);
        setIntField(term294849, term294849.getClass(), "gradeRating", 0);
        setIntField(term294849, term294849.getClass(), "musicRating", 0);
        setIntField(term294849, term294849.getClass(), "playerRating", 0);
        setIntField(term294849, term294849.getClass(), "highestRating", 0);
        setIntField(term294849, term294849.getClass(), "gradeRank", 0);
        setIntField(term294849, term294849.getClass(), "classRank", 0);
        setIntField(term294849, term294849.getClass(), "courseRank", 0);
        setField(term294849, term294849.getClass(), "charaSlot", null);
        setField(term294849, term294849.getClass(), "charaLockSlot", null);
        setLongField(term294849, term294849.getClass(), "contentBit", 0L);
        setIntField(term294849, term294849.getClass(), "playCount", 0);
        setField(term294849, term294849.getClass(), "eventWatchedDate", null);
        setField(term294849, term294849.getClass(), "lastGameId", null);
        setField(term294849, term294849.getClass(), "lastRomVersion", null);
        setField(term294849, term294849.getClass(), "lastDataVersion", null);
        setField(term294849, term294849.getClass(), "lastLoginDate", null);
        setField(term294849, term294849.getClass(), "lastPlayDate", null);
        setIntField(term294849, term294849.getClass(), "lastPlayCredit", 0);
        setIntField(term294849, term294849.getClass(), "lastPlayMode", 0);
        setIntField(term294849, term294849.getClass(), "lastPlaceId", 0);
        setField(term294849, term294849.getClass(), "lastPlaceName", null);
        setIntField(term294849, term294849.getClass(), "lastAllNetId", 0);
        setIntField(term294849, term294849.getClass(), "lastRegionId", 0);
        setField(term294849, term294849.getClass(), "lastRegionName", null);
        setField(term294849, term294849.getClass(), "lastClientId", null);
        setField(term294849, term294849.getClass(), "lastCountryCode", null);
        setIntField(term294849, term294849.getClass(), "lastSelectEMoney", 0);
        setIntField(term294849, term294849.getClass(), "lastSelectTicket", 0);
        setIntField(term294849, term294849.getClass(), "lastSelectCourse", 0);
        setIntField(term294849, term294849.getClass(), "lastCountCourse", 0);
        setField(term294849, term294849.getClass(), "firstGameId", null);
        setField(term294849, term294849.getClass(), "firstRomVersion", null);
        setField(term294849, term294849.getClass(), "firstDataVersion", null);
        setField(term294849, term294849.getClass(), "firstPlayDate", null);
        setField(term294849, term294849.getClass(), "compatibleCmVersion", null);
        setField(term294849, term294849.getClass(), "dailyBonusDate", null);
        setField(term294849, term294849.getClass(), "dailyCourseBonusDate", null);
        setField(term294849, term294849.getClass(), "lastPairLoginDate", null);
        setField(term294849, term294849.getClass(), "lastTrialPlayDate", null);
        setIntField(term294849, term294849.getClass(), "playVsCount", 0);
        setIntField(term294849, term294849.getClass(), "playSyncCount", 0);
        setIntField(term294849, term294849.getClass(), "winCount", 0);
        setIntField(term294849, term294849.getClass(), "helpCount", 0);
        setIntField(term294849, term294849.getClass(), "comboCount", 0);
        setLongField(term294849, term294849.getClass(), "totalDeluxscore", 0L);
        setLongField(term294849, term294849.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294849, term294849.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294849, term294849.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294849, term294849.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294849, term294849.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294849, term294849.getClass(), "totalSync", 0);
        setIntField(term294849, term294849.getClass(), "totalBasicSync", 0);
        setIntField(term294849, term294849.getClass(), "totalAdvancedSync", 0);
        setIntField(term294849, term294849.getClass(), "totalExpertSync", 0);
        setIntField(term294849, term294849.getClass(), "totalMasterSync", 0);
        setIntField(term294849, term294849.getClass(), "totalReMasterSync", 0);
        setLongField(term294849, term294849.getClass(), "totalAchievement", 0L);
        setLongField(term294849, term294849.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294849, term294849.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294849, term294849.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294849, term294849.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294849, term294849.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294849, term294849.getClass(), "playerOldRating", 0L);
        setLongField(term294849, term294849.getClass(), "playerNewRating", 0L);
        setIntField(term294849, term294849.getClass(), "banState", 0);
        setLongField(term294849, term294849.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term294849, args);
    }

};


