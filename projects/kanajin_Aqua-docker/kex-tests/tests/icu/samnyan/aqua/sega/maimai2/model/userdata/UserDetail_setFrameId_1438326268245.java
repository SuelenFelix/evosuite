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
import java.lang.Integer;

public class UserDetail_setFrameId_1438326268245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290848;
     Object term290903;

    public UserDetail_setFrameId_1438326268245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290848 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290848, term290848.getClass(), "id", 0L);
        setField(term290848, term290848.getClass(), "card", null);
        setField(term290848, term290848.getClass(), "userName", null);
        setIntField(term290848, term290848.getClass(), "isNetMember", 0);
        setIntField(term290848, term290848.getClass(), "iconId", 0);
        setIntField(term290848, term290848.getClass(), "plateId", 0);
        setIntField(term290848, term290848.getClass(), "titleId", 0);
        setIntField(term290848, term290848.getClass(), "partnerId", 0);
        setIntField(term290848, term290848.getClass(), "frameId", 0);
        setIntField(term290848, term290848.getClass(), "selectMapId", 0);
        setIntField(term290848, term290848.getClass(), "totalAwake", 0);
        setIntField(term290848, term290848.getClass(), "gradeRating", 0);
        setIntField(term290848, term290848.getClass(), "musicRating", 0);
        setIntField(term290848, term290848.getClass(), "playerRating", 0);
        setIntField(term290848, term290848.getClass(), "highestRating", 0);
        setIntField(term290848, term290848.getClass(), "gradeRank", 0);
        setIntField(term290848, term290848.getClass(), "classRank", 0);
        setIntField(term290848, term290848.getClass(), "courseRank", 0);
        setField(term290848, term290848.getClass(), "charaSlot", null);
        setField(term290848, term290848.getClass(), "charaLockSlot", null);
        setLongField(term290848, term290848.getClass(), "contentBit", 0L);
        setIntField(term290848, term290848.getClass(), "playCount", 0);
        setField(term290848, term290848.getClass(), "eventWatchedDate", null);
        setField(term290848, term290848.getClass(), "lastGameId", null);
        setField(term290848, term290848.getClass(), "lastRomVersion", null);
        setField(term290848, term290848.getClass(), "lastDataVersion", null);
        setField(term290848, term290848.getClass(), "lastLoginDate", null);
        setField(term290848, term290848.getClass(), "lastPlayDate", null);
        setIntField(term290848, term290848.getClass(), "lastPlayCredit", 0);
        setIntField(term290848, term290848.getClass(), "lastPlayMode", 0);
        setIntField(term290848, term290848.getClass(), "lastPlaceId", 0);
        setField(term290848, term290848.getClass(), "lastPlaceName", null);
        setIntField(term290848, term290848.getClass(), "lastAllNetId", 0);
        setIntField(term290848, term290848.getClass(), "lastRegionId", 0);
        setField(term290848, term290848.getClass(), "lastRegionName", null);
        setField(term290848, term290848.getClass(), "lastClientId", null);
        setField(term290848, term290848.getClass(), "lastCountryCode", null);
        setIntField(term290848, term290848.getClass(), "lastSelectEMoney", 0);
        setIntField(term290848, term290848.getClass(), "lastSelectTicket", 0);
        setIntField(term290848, term290848.getClass(), "lastSelectCourse", 0);
        setIntField(term290848, term290848.getClass(), "lastCountCourse", 0);
        setField(term290848, term290848.getClass(), "firstGameId", null);
        setField(term290848, term290848.getClass(), "firstRomVersion", null);
        setField(term290848, term290848.getClass(), "firstDataVersion", null);
        setField(term290848, term290848.getClass(), "firstPlayDate", null);
        setField(term290848, term290848.getClass(), "compatibleCmVersion", null);
        setField(term290848, term290848.getClass(), "dailyBonusDate", null);
        setField(term290848, term290848.getClass(), "dailyCourseBonusDate", null);
        setField(term290848, term290848.getClass(), "lastPairLoginDate", null);
        setField(term290848, term290848.getClass(), "lastTrialPlayDate", null);
        setIntField(term290848, term290848.getClass(), "playVsCount", 0);
        setIntField(term290848, term290848.getClass(), "playSyncCount", 0);
        setIntField(term290848, term290848.getClass(), "winCount", 0);
        setIntField(term290848, term290848.getClass(), "helpCount", 0);
        setIntField(term290848, term290848.getClass(), "comboCount", 0);
        setLongField(term290848, term290848.getClass(), "totalDeluxscore", 0L);
        setLongField(term290848, term290848.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290848, term290848.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290848, term290848.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290848, term290848.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290848, term290848.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290848, term290848.getClass(), "totalSync", 0);
        setIntField(term290848, term290848.getClass(), "totalBasicSync", 0);
        setIntField(term290848, term290848.getClass(), "totalAdvancedSync", 0);
        setIntField(term290848, term290848.getClass(), "totalExpertSync", 0);
        setIntField(term290848, term290848.getClass(), "totalMasterSync", 0);
        setIntField(term290848, term290848.getClass(), "totalReMasterSync", 0);
        setLongField(term290848, term290848.getClass(), "totalAchievement", 0L);
        setLongField(term290848, term290848.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290848, term290848.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290848, term290848.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290848, term290848.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290848, term290848.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290848, term290848.getClass(), "playerOldRating", 0L);
        setLongField(term290848, term290848.getClass(), "playerNewRating", 0L);
        setIntField(term290848, term290848.getClass(), "banState", 0);
        setLongField(term290848, term290848.getClass(), "dateTime", 0L);
        term290903 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290903;
        callMethod(klass, "setFrameId", argTypes, term290848, args);
    }

};


