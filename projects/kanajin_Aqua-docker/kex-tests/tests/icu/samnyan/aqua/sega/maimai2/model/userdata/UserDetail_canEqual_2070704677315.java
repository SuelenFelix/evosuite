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

public class UserDetail_canEqual_2070704677315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294794;

    public UserDetail_canEqual_2070704677315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294794 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294794, term294794.getClass(), "id", 0L);
        setField(term294794, term294794.getClass(), "card", null);
        setField(term294794, term294794.getClass(), "userName", null);
        setIntField(term294794, term294794.getClass(), "isNetMember", 0);
        setIntField(term294794, term294794.getClass(), "iconId", 0);
        setIntField(term294794, term294794.getClass(), "plateId", 0);
        setIntField(term294794, term294794.getClass(), "titleId", 0);
        setIntField(term294794, term294794.getClass(), "partnerId", 0);
        setIntField(term294794, term294794.getClass(), "frameId", 0);
        setIntField(term294794, term294794.getClass(), "selectMapId", 0);
        setIntField(term294794, term294794.getClass(), "totalAwake", 0);
        setIntField(term294794, term294794.getClass(), "gradeRating", 0);
        setIntField(term294794, term294794.getClass(), "musicRating", 0);
        setIntField(term294794, term294794.getClass(), "playerRating", 0);
        setIntField(term294794, term294794.getClass(), "highestRating", 0);
        setIntField(term294794, term294794.getClass(), "gradeRank", 0);
        setIntField(term294794, term294794.getClass(), "classRank", 0);
        setIntField(term294794, term294794.getClass(), "courseRank", 0);
        setField(term294794, term294794.getClass(), "charaSlot", null);
        setField(term294794, term294794.getClass(), "charaLockSlot", null);
        setLongField(term294794, term294794.getClass(), "contentBit", 0L);
        setIntField(term294794, term294794.getClass(), "playCount", 0);
        setField(term294794, term294794.getClass(), "eventWatchedDate", null);
        setField(term294794, term294794.getClass(), "lastGameId", null);
        setField(term294794, term294794.getClass(), "lastRomVersion", null);
        setField(term294794, term294794.getClass(), "lastDataVersion", null);
        setField(term294794, term294794.getClass(), "lastLoginDate", null);
        setField(term294794, term294794.getClass(), "lastPlayDate", null);
        setIntField(term294794, term294794.getClass(), "lastPlayCredit", 0);
        setIntField(term294794, term294794.getClass(), "lastPlayMode", 0);
        setIntField(term294794, term294794.getClass(), "lastPlaceId", 0);
        setField(term294794, term294794.getClass(), "lastPlaceName", null);
        setIntField(term294794, term294794.getClass(), "lastAllNetId", 0);
        setIntField(term294794, term294794.getClass(), "lastRegionId", 0);
        setField(term294794, term294794.getClass(), "lastRegionName", null);
        setField(term294794, term294794.getClass(), "lastClientId", null);
        setField(term294794, term294794.getClass(), "lastCountryCode", null);
        setIntField(term294794, term294794.getClass(), "lastSelectEMoney", 0);
        setIntField(term294794, term294794.getClass(), "lastSelectTicket", 0);
        setIntField(term294794, term294794.getClass(), "lastSelectCourse", 0);
        setIntField(term294794, term294794.getClass(), "lastCountCourse", 0);
        setField(term294794, term294794.getClass(), "firstGameId", null);
        setField(term294794, term294794.getClass(), "firstRomVersion", null);
        setField(term294794, term294794.getClass(), "firstDataVersion", null);
        setField(term294794, term294794.getClass(), "firstPlayDate", null);
        setField(term294794, term294794.getClass(), "compatibleCmVersion", null);
        setField(term294794, term294794.getClass(), "dailyBonusDate", null);
        setField(term294794, term294794.getClass(), "dailyCourseBonusDate", null);
        setField(term294794, term294794.getClass(), "lastPairLoginDate", null);
        setField(term294794, term294794.getClass(), "lastTrialPlayDate", null);
        setIntField(term294794, term294794.getClass(), "playVsCount", 0);
        setIntField(term294794, term294794.getClass(), "playSyncCount", 0);
        setIntField(term294794, term294794.getClass(), "winCount", 0);
        setIntField(term294794, term294794.getClass(), "helpCount", 0);
        setIntField(term294794, term294794.getClass(), "comboCount", 0);
        setLongField(term294794, term294794.getClass(), "totalDeluxscore", 0L);
        setLongField(term294794, term294794.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294794, term294794.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294794, term294794.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294794, term294794.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294794, term294794.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294794, term294794.getClass(), "totalSync", 0);
        setIntField(term294794, term294794.getClass(), "totalBasicSync", 0);
        setIntField(term294794, term294794.getClass(), "totalAdvancedSync", 0);
        setIntField(term294794, term294794.getClass(), "totalExpertSync", 0);
        setIntField(term294794, term294794.getClass(), "totalMasterSync", 0);
        setIntField(term294794, term294794.getClass(), "totalReMasterSync", 0);
        setLongField(term294794, term294794.getClass(), "totalAchievement", 0L);
        setLongField(term294794, term294794.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294794, term294794.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294794, term294794.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294794, term294794.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294794, term294794.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294794, term294794.getClass(), "playerOldRating", 0L);
        setLongField(term294794, term294794.getClass(), "playerNewRating", 0L);
        setIntField(term294794, term294794.getClass(), "banState", 0);
        setLongField(term294794, term294794.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term294794, args);
    }

};


