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

public class UserDetail_getTotalMasterSync_1913742477225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289736;

    public UserDetail_getTotalMasterSync_1913742477225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289736 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289736, term289736.getClass(), "id", 0L);
        setField(term289736, term289736.getClass(), "card", null);
        setField(term289736, term289736.getClass(), "userName", null);
        setIntField(term289736, term289736.getClass(), "isNetMember", 0);
        setIntField(term289736, term289736.getClass(), "iconId", 0);
        setIntField(term289736, term289736.getClass(), "plateId", 0);
        setIntField(term289736, term289736.getClass(), "titleId", 0);
        setIntField(term289736, term289736.getClass(), "partnerId", 0);
        setIntField(term289736, term289736.getClass(), "frameId", 0);
        setIntField(term289736, term289736.getClass(), "selectMapId", 0);
        setIntField(term289736, term289736.getClass(), "totalAwake", 0);
        setIntField(term289736, term289736.getClass(), "gradeRating", 0);
        setIntField(term289736, term289736.getClass(), "musicRating", 0);
        setIntField(term289736, term289736.getClass(), "playerRating", 0);
        setIntField(term289736, term289736.getClass(), "highestRating", 0);
        setIntField(term289736, term289736.getClass(), "gradeRank", 0);
        setIntField(term289736, term289736.getClass(), "classRank", 0);
        setIntField(term289736, term289736.getClass(), "courseRank", 0);
        setField(term289736, term289736.getClass(), "charaSlot", null);
        setField(term289736, term289736.getClass(), "charaLockSlot", null);
        setLongField(term289736, term289736.getClass(), "contentBit", 0L);
        setIntField(term289736, term289736.getClass(), "playCount", 0);
        setField(term289736, term289736.getClass(), "eventWatchedDate", null);
        setField(term289736, term289736.getClass(), "lastGameId", null);
        setField(term289736, term289736.getClass(), "lastRomVersion", null);
        setField(term289736, term289736.getClass(), "lastDataVersion", null);
        setField(term289736, term289736.getClass(), "lastLoginDate", null);
        setField(term289736, term289736.getClass(), "lastPlayDate", null);
        setIntField(term289736, term289736.getClass(), "lastPlayCredit", 0);
        setIntField(term289736, term289736.getClass(), "lastPlayMode", 0);
        setIntField(term289736, term289736.getClass(), "lastPlaceId", 0);
        setField(term289736, term289736.getClass(), "lastPlaceName", null);
        setIntField(term289736, term289736.getClass(), "lastAllNetId", 0);
        setIntField(term289736, term289736.getClass(), "lastRegionId", 0);
        setField(term289736, term289736.getClass(), "lastRegionName", null);
        setField(term289736, term289736.getClass(), "lastClientId", null);
        setField(term289736, term289736.getClass(), "lastCountryCode", null);
        setIntField(term289736, term289736.getClass(), "lastSelectEMoney", 0);
        setIntField(term289736, term289736.getClass(), "lastSelectTicket", 0);
        setIntField(term289736, term289736.getClass(), "lastSelectCourse", 0);
        setIntField(term289736, term289736.getClass(), "lastCountCourse", 0);
        setField(term289736, term289736.getClass(), "firstGameId", null);
        setField(term289736, term289736.getClass(), "firstRomVersion", null);
        setField(term289736, term289736.getClass(), "firstDataVersion", null);
        setField(term289736, term289736.getClass(), "firstPlayDate", null);
        setField(term289736, term289736.getClass(), "compatibleCmVersion", null);
        setField(term289736, term289736.getClass(), "dailyBonusDate", null);
        setField(term289736, term289736.getClass(), "dailyCourseBonusDate", null);
        setField(term289736, term289736.getClass(), "lastPairLoginDate", null);
        setField(term289736, term289736.getClass(), "lastTrialPlayDate", null);
        setIntField(term289736, term289736.getClass(), "playVsCount", 0);
        setIntField(term289736, term289736.getClass(), "playSyncCount", 0);
        setIntField(term289736, term289736.getClass(), "winCount", 0);
        setIntField(term289736, term289736.getClass(), "helpCount", 0);
        setIntField(term289736, term289736.getClass(), "comboCount", 0);
        setLongField(term289736, term289736.getClass(), "totalDeluxscore", 0L);
        setLongField(term289736, term289736.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289736, term289736.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289736, term289736.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289736, term289736.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289736, term289736.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289736, term289736.getClass(), "totalSync", 0);
        setIntField(term289736, term289736.getClass(), "totalBasicSync", 0);
        setIntField(term289736, term289736.getClass(), "totalAdvancedSync", 0);
        setIntField(term289736, term289736.getClass(), "totalExpertSync", 0);
        setIntField(term289736, term289736.getClass(), "totalMasterSync", 0);
        setIntField(term289736, term289736.getClass(), "totalReMasterSync", 0);
        setLongField(term289736, term289736.getClass(), "totalAchievement", 0L);
        setLongField(term289736, term289736.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289736, term289736.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289736, term289736.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289736, term289736.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289736, term289736.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289736, term289736.getClass(), "playerOldRating", 0L);
        setLongField(term289736, term289736.getClass(), "playerNewRating", 0L);
        setIntField(term289736, term289736.getClass(), "banState", 0);
        setLongField(term289736, term289736.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterSync", argTypes, term289736, args);
    }

};


