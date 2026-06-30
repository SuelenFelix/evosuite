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

public class UserDetail_getTotalExpertAchievement_1666340097230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290011;

    public UserDetail_getTotalExpertAchievement_1666340097230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290011 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290011, term290011.getClass(), "id", 0L);
        setField(term290011, term290011.getClass(), "card", null);
        setField(term290011, term290011.getClass(), "userName", null);
        setIntField(term290011, term290011.getClass(), "isNetMember", 0);
        setIntField(term290011, term290011.getClass(), "iconId", 0);
        setIntField(term290011, term290011.getClass(), "plateId", 0);
        setIntField(term290011, term290011.getClass(), "titleId", 0);
        setIntField(term290011, term290011.getClass(), "partnerId", 0);
        setIntField(term290011, term290011.getClass(), "frameId", 0);
        setIntField(term290011, term290011.getClass(), "selectMapId", 0);
        setIntField(term290011, term290011.getClass(), "totalAwake", 0);
        setIntField(term290011, term290011.getClass(), "gradeRating", 0);
        setIntField(term290011, term290011.getClass(), "musicRating", 0);
        setIntField(term290011, term290011.getClass(), "playerRating", 0);
        setIntField(term290011, term290011.getClass(), "highestRating", 0);
        setIntField(term290011, term290011.getClass(), "gradeRank", 0);
        setIntField(term290011, term290011.getClass(), "classRank", 0);
        setIntField(term290011, term290011.getClass(), "courseRank", 0);
        setField(term290011, term290011.getClass(), "charaSlot", null);
        setField(term290011, term290011.getClass(), "charaLockSlot", null);
        setLongField(term290011, term290011.getClass(), "contentBit", 0L);
        setIntField(term290011, term290011.getClass(), "playCount", 0);
        setField(term290011, term290011.getClass(), "eventWatchedDate", null);
        setField(term290011, term290011.getClass(), "lastGameId", null);
        setField(term290011, term290011.getClass(), "lastRomVersion", null);
        setField(term290011, term290011.getClass(), "lastDataVersion", null);
        setField(term290011, term290011.getClass(), "lastLoginDate", null);
        setField(term290011, term290011.getClass(), "lastPlayDate", null);
        setIntField(term290011, term290011.getClass(), "lastPlayCredit", 0);
        setIntField(term290011, term290011.getClass(), "lastPlayMode", 0);
        setIntField(term290011, term290011.getClass(), "lastPlaceId", 0);
        setField(term290011, term290011.getClass(), "lastPlaceName", null);
        setIntField(term290011, term290011.getClass(), "lastAllNetId", 0);
        setIntField(term290011, term290011.getClass(), "lastRegionId", 0);
        setField(term290011, term290011.getClass(), "lastRegionName", null);
        setField(term290011, term290011.getClass(), "lastClientId", null);
        setField(term290011, term290011.getClass(), "lastCountryCode", null);
        setIntField(term290011, term290011.getClass(), "lastSelectEMoney", 0);
        setIntField(term290011, term290011.getClass(), "lastSelectTicket", 0);
        setIntField(term290011, term290011.getClass(), "lastSelectCourse", 0);
        setIntField(term290011, term290011.getClass(), "lastCountCourse", 0);
        setField(term290011, term290011.getClass(), "firstGameId", null);
        setField(term290011, term290011.getClass(), "firstRomVersion", null);
        setField(term290011, term290011.getClass(), "firstDataVersion", null);
        setField(term290011, term290011.getClass(), "firstPlayDate", null);
        setField(term290011, term290011.getClass(), "compatibleCmVersion", null);
        setField(term290011, term290011.getClass(), "dailyBonusDate", null);
        setField(term290011, term290011.getClass(), "dailyCourseBonusDate", null);
        setField(term290011, term290011.getClass(), "lastPairLoginDate", null);
        setField(term290011, term290011.getClass(), "lastTrialPlayDate", null);
        setIntField(term290011, term290011.getClass(), "playVsCount", 0);
        setIntField(term290011, term290011.getClass(), "playSyncCount", 0);
        setIntField(term290011, term290011.getClass(), "winCount", 0);
        setIntField(term290011, term290011.getClass(), "helpCount", 0);
        setIntField(term290011, term290011.getClass(), "comboCount", 0);
        setLongField(term290011, term290011.getClass(), "totalDeluxscore", 0L);
        setLongField(term290011, term290011.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290011, term290011.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290011, term290011.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290011, term290011.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290011, term290011.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290011, term290011.getClass(), "totalSync", 0);
        setIntField(term290011, term290011.getClass(), "totalBasicSync", 0);
        setIntField(term290011, term290011.getClass(), "totalAdvancedSync", 0);
        setIntField(term290011, term290011.getClass(), "totalExpertSync", 0);
        setIntField(term290011, term290011.getClass(), "totalMasterSync", 0);
        setIntField(term290011, term290011.getClass(), "totalReMasterSync", 0);
        setLongField(term290011, term290011.getClass(), "totalAchievement", 0L);
        setLongField(term290011, term290011.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290011, term290011.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290011, term290011.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290011, term290011.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290011, term290011.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290011, term290011.getClass(), "playerOldRating", 0L);
        setLongField(term290011, term290011.getClass(), "playerNewRating", 0L);
        setIntField(term290011, term290011.getClass(), "banState", 0);
        setLongField(term290011, term290011.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertAchievement", argTypes, term290011, args);
    }

};


