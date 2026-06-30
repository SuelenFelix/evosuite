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

public class UserDetail_getFrameId_1304021146168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4320774;

    public UserDetail_getFrameId_1304021146168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4320774 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term4320774, term4320774.getClass(), "id", 0L);
        setField(term4320774, term4320774.getClass(), "card", null);
        setField(term4320774, term4320774.getClass(), "userName", null);
        setIntField(term4320774, term4320774.getClass(), "isNetMember", 0);
        setIntField(term4320774, term4320774.getClass(), "iconId", 0);
        setIntField(term4320774, term4320774.getClass(), "plateId", 0);
        setIntField(term4320774, term4320774.getClass(), "titleId", 0);
        setIntField(term4320774, term4320774.getClass(), "partnerId", 0);
        setIntField(term4320774, term4320774.getClass(), "frameId", 0);
        setIntField(term4320774, term4320774.getClass(), "selectMapId", 0);
        setIntField(term4320774, term4320774.getClass(), "totalAwake", 0);
        setIntField(term4320774, term4320774.getClass(), "gradeRating", 0);
        setIntField(term4320774, term4320774.getClass(), "musicRating", 0);
        setIntField(term4320774, term4320774.getClass(), "playerRating", 0);
        setIntField(term4320774, term4320774.getClass(), "highestRating", 0);
        setIntField(term4320774, term4320774.getClass(), "gradeRank", 0);
        setIntField(term4320774, term4320774.getClass(), "classRank", 0);
        setIntField(term4320774, term4320774.getClass(), "courseRank", 0);
        setField(term4320774, term4320774.getClass(), "charaSlot", null);
        setField(term4320774, term4320774.getClass(), "charaLockSlot", null);
        setLongField(term4320774, term4320774.getClass(), "contentBit", 0L);
        setIntField(term4320774, term4320774.getClass(), "playCount", 0);
        setField(term4320774, term4320774.getClass(), "eventWatchedDate", null);
        setField(term4320774, term4320774.getClass(), "lastGameId", null);
        setField(term4320774, term4320774.getClass(), "lastRomVersion", null);
        setField(term4320774, term4320774.getClass(), "lastDataVersion", null);
        setField(term4320774, term4320774.getClass(), "lastLoginDate", null);
        setField(term4320774, term4320774.getClass(), "lastPlayDate", null);
        setIntField(term4320774, term4320774.getClass(), "lastPlayCredit", 0);
        setIntField(term4320774, term4320774.getClass(), "lastPlayMode", 0);
        setIntField(term4320774, term4320774.getClass(), "lastPlaceId", 0);
        setField(term4320774, term4320774.getClass(), "lastPlaceName", null);
        setIntField(term4320774, term4320774.getClass(), "lastAllNetId", 0);
        setIntField(term4320774, term4320774.getClass(), "lastRegionId", 0);
        setField(term4320774, term4320774.getClass(), "lastRegionName", null);
        setField(term4320774, term4320774.getClass(), "lastClientId", null);
        setField(term4320774, term4320774.getClass(), "lastCountryCode", null);
        setIntField(term4320774, term4320774.getClass(), "lastSelectEMoney", 0);
        setIntField(term4320774, term4320774.getClass(), "lastSelectTicket", 0);
        setIntField(term4320774, term4320774.getClass(), "lastSelectCourse", 0);
        setIntField(term4320774, term4320774.getClass(), "lastCountCourse", 0);
        setField(term4320774, term4320774.getClass(), "firstGameId", null);
        setField(term4320774, term4320774.getClass(), "firstRomVersion", null);
        setField(term4320774, term4320774.getClass(), "firstDataVersion", null);
        setField(term4320774, term4320774.getClass(), "firstPlayDate", null);
        setField(term4320774, term4320774.getClass(), "compatibleCmVersion", null);
        setField(term4320774, term4320774.getClass(), "dailyBonusDate", null);
        setField(term4320774, term4320774.getClass(), "dailyCourseBonusDate", null);
        setField(term4320774, term4320774.getClass(), "lastPairLoginDate", null);
        setField(term4320774, term4320774.getClass(), "lastTrialPlayDate", null);
        setIntField(term4320774, term4320774.getClass(), "playVsCount", 0);
        setIntField(term4320774, term4320774.getClass(), "playSyncCount", 0);
        setIntField(term4320774, term4320774.getClass(), "winCount", 0);
        setIntField(term4320774, term4320774.getClass(), "helpCount", 0);
        setIntField(term4320774, term4320774.getClass(), "comboCount", 0);
        setLongField(term4320774, term4320774.getClass(), "totalDeluxscore", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term4320774, term4320774.getClass(), "totalSync", 0);
        setIntField(term4320774, term4320774.getClass(), "totalBasicSync", 0);
        setIntField(term4320774, term4320774.getClass(), "totalAdvancedSync", 0);
        setIntField(term4320774, term4320774.getClass(), "totalExpertSync", 0);
        setIntField(term4320774, term4320774.getClass(), "totalMasterSync", 0);
        setIntField(term4320774, term4320774.getClass(), "totalReMasterSync", 0);
        setLongField(term4320774, term4320774.getClass(), "totalAchievement", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalBasicAchievement", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalExpertAchievement", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalMasterAchievement", 0L);
        setLongField(term4320774, term4320774.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term4320774, term4320774.getClass(), "playerOldRating", 0L);
        setLongField(term4320774, term4320774.getClass(), "playerNewRating", 0L);
        setIntField(term4320774, term4320774.getClass(), "banState", 0);
        setLongField(term4320774, term4320774.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term4320774, args);
    }

};


