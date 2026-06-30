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

public class UserDetail_setComboCount_1165172671291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293428;
     Object term293483;

    public UserDetail_setComboCount_1165172671291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293428 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293428, term293428.getClass(), "id", 0L);
        setField(term293428, term293428.getClass(), "card", null);
        setField(term293428, term293428.getClass(), "userName", null);
        setIntField(term293428, term293428.getClass(), "isNetMember", 0);
        setIntField(term293428, term293428.getClass(), "iconId", 0);
        setIntField(term293428, term293428.getClass(), "plateId", 0);
        setIntField(term293428, term293428.getClass(), "titleId", 0);
        setIntField(term293428, term293428.getClass(), "partnerId", 0);
        setIntField(term293428, term293428.getClass(), "frameId", 0);
        setIntField(term293428, term293428.getClass(), "selectMapId", 0);
        setIntField(term293428, term293428.getClass(), "totalAwake", 0);
        setIntField(term293428, term293428.getClass(), "gradeRating", 0);
        setIntField(term293428, term293428.getClass(), "musicRating", 0);
        setIntField(term293428, term293428.getClass(), "playerRating", 0);
        setIntField(term293428, term293428.getClass(), "highestRating", 0);
        setIntField(term293428, term293428.getClass(), "gradeRank", 0);
        setIntField(term293428, term293428.getClass(), "classRank", 0);
        setIntField(term293428, term293428.getClass(), "courseRank", 0);
        setField(term293428, term293428.getClass(), "charaSlot", null);
        setField(term293428, term293428.getClass(), "charaLockSlot", null);
        setLongField(term293428, term293428.getClass(), "contentBit", 0L);
        setIntField(term293428, term293428.getClass(), "playCount", 0);
        setField(term293428, term293428.getClass(), "eventWatchedDate", null);
        setField(term293428, term293428.getClass(), "lastGameId", null);
        setField(term293428, term293428.getClass(), "lastRomVersion", null);
        setField(term293428, term293428.getClass(), "lastDataVersion", null);
        setField(term293428, term293428.getClass(), "lastLoginDate", null);
        setField(term293428, term293428.getClass(), "lastPlayDate", null);
        setIntField(term293428, term293428.getClass(), "lastPlayCredit", 0);
        setIntField(term293428, term293428.getClass(), "lastPlayMode", 0);
        setIntField(term293428, term293428.getClass(), "lastPlaceId", 0);
        setField(term293428, term293428.getClass(), "lastPlaceName", null);
        setIntField(term293428, term293428.getClass(), "lastAllNetId", 0);
        setIntField(term293428, term293428.getClass(), "lastRegionId", 0);
        setField(term293428, term293428.getClass(), "lastRegionName", null);
        setField(term293428, term293428.getClass(), "lastClientId", null);
        setField(term293428, term293428.getClass(), "lastCountryCode", null);
        setIntField(term293428, term293428.getClass(), "lastSelectEMoney", 0);
        setIntField(term293428, term293428.getClass(), "lastSelectTicket", 0);
        setIntField(term293428, term293428.getClass(), "lastSelectCourse", 0);
        setIntField(term293428, term293428.getClass(), "lastCountCourse", 0);
        setField(term293428, term293428.getClass(), "firstGameId", null);
        setField(term293428, term293428.getClass(), "firstRomVersion", null);
        setField(term293428, term293428.getClass(), "firstDataVersion", null);
        setField(term293428, term293428.getClass(), "firstPlayDate", null);
        setField(term293428, term293428.getClass(), "compatibleCmVersion", null);
        setField(term293428, term293428.getClass(), "dailyBonusDate", null);
        setField(term293428, term293428.getClass(), "dailyCourseBonusDate", null);
        setField(term293428, term293428.getClass(), "lastPairLoginDate", null);
        setField(term293428, term293428.getClass(), "lastTrialPlayDate", null);
        setIntField(term293428, term293428.getClass(), "playVsCount", 0);
        setIntField(term293428, term293428.getClass(), "playSyncCount", 0);
        setIntField(term293428, term293428.getClass(), "winCount", 0);
        setIntField(term293428, term293428.getClass(), "helpCount", 0);
        setIntField(term293428, term293428.getClass(), "comboCount", 0);
        setLongField(term293428, term293428.getClass(), "totalDeluxscore", 0L);
        setLongField(term293428, term293428.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293428, term293428.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293428, term293428.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293428, term293428.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293428, term293428.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293428, term293428.getClass(), "totalSync", 0);
        setIntField(term293428, term293428.getClass(), "totalBasicSync", 0);
        setIntField(term293428, term293428.getClass(), "totalAdvancedSync", 0);
        setIntField(term293428, term293428.getClass(), "totalExpertSync", 0);
        setIntField(term293428, term293428.getClass(), "totalMasterSync", 0);
        setIntField(term293428, term293428.getClass(), "totalReMasterSync", 0);
        setLongField(term293428, term293428.getClass(), "totalAchievement", 0L);
        setLongField(term293428, term293428.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293428, term293428.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293428, term293428.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293428, term293428.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293428, term293428.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293428, term293428.getClass(), "playerOldRating", 0L);
        setLongField(term293428, term293428.getClass(), "playerNewRating", 0L);
        setIntField(term293428, term293428.getClass(), "banState", 0);
        setLongField(term293428, term293428.getClass(), "dateTime", 0L);
        term293483 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293483;
        callMethod(klass, "setComboCount", argTypes, term293428, args);
    }

};


