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

public class UserDetail_setTotalAwake_1036918591247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290962;
     Object term291017;

    public UserDetail_setTotalAwake_1036918591247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290962 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290962, term290962.getClass(), "id", 0L);
        setField(term290962, term290962.getClass(), "card", null);
        setField(term290962, term290962.getClass(), "userName", null);
        setIntField(term290962, term290962.getClass(), "isNetMember", 0);
        setIntField(term290962, term290962.getClass(), "iconId", 0);
        setIntField(term290962, term290962.getClass(), "plateId", 0);
        setIntField(term290962, term290962.getClass(), "titleId", 0);
        setIntField(term290962, term290962.getClass(), "partnerId", 0);
        setIntField(term290962, term290962.getClass(), "frameId", 0);
        setIntField(term290962, term290962.getClass(), "selectMapId", 0);
        setIntField(term290962, term290962.getClass(), "totalAwake", 0);
        setIntField(term290962, term290962.getClass(), "gradeRating", 0);
        setIntField(term290962, term290962.getClass(), "musicRating", 0);
        setIntField(term290962, term290962.getClass(), "playerRating", 0);
        setIntField(term290962, term290962.getClass(), "highestRating", 0);
        setIntField(term290962, term290962.getClass(), "gradeRank", 0);
        setIntField(term290962, term290962.getClass(), "classRank", 0);
        setIntField(term290962, term290962.getClass(), "courseRank", 0);
        setField(term290962, term290962.getClass(), "charaSlot", null);
        setField(term290962, term290962.getClass(), "charaLockSlot", null);
        setLongField(term290962, term290962.getClass(), "contentBit", 0L);
        setIntField(term290962, term290962.getClass(), "playCount", 0);
        setField(term290962, term290962.getClass(), "eventWatchedDate", null);
        setField(term290962, term290962.getClass(), "lastGameId", null);
        setField(term290962, term290962.getClass(), "lastRomVersion", null);
        setField(term290962, term290962.getClass(), "lastDataVersion", null);
        setField(term290962, term290962.getClass(), "lastLoginDate", null);
        setField(term290962, term290962.getClass(), "lastPlayDate", null);
        setIntField(term290962, term290962.getClass(), "lastPlayCredit", 0);
        setIntField(term290962, term290962.getClass(), "lastPlayMode", 0);
        setIntField(term290962, term290962.getClass(), "lastPlaceId", 0);
        setField(term290962, term290962.getClass(), "lastPlaceName", null);
        setIntField(term290962, term290962.getClass(), "lastAllNetId", 0);
        setIntField(term290962, term290962.getClass(), "lastRegionId", 0);
        setField(term290962, term290962.getClass(), "lastRegionName", null);
        setField(term290962, term290962.getClass(), "lastClientId", null);
        setField(term290962, term290962.getClass(), "lastCountryCode", null);
        setIntField(term290962, term290962.getClass(), "lastSelectEMoney", 0);
        setIntField(term290962, term290962.getClass(), "lastSelectTicket", 0);
        setIntField(term290962, term290962.getClass(), "lastSelectCourse", 0);
        setIntField(term290962, term290962.getClass(), "lastCountCourse", 0);
        setField(term290962, term290962.getClass(), "firstGameId", null);
        setField(term290962, term290962.getClass(), "firstRomVersion", null);
        setField(term290962, term290962.getClass(), "firstDataVersion", null);
        setField(term290962, term290962.getClass(), "firstPlayDate", null);
        setField(term290962, term290962.getClass(), "compatibleCmVersion", null);
        setField(term290962, term290962.getClass(), "dailyBonusDate", null);
        setField(term290962, term290962.getClass(), "dailyCourseBonusDate", null);
        setField(term290962, term290962.getClass(), "lastPairLoginDate", null);
        setField(term290962, term290962.getClass(), "lastTrialPlayDate", null);
        setIntField(term290962, term290962.getClass(), "playVsCount", 0);
        setIntField(term290962, term290962.getClass(), "playSyncCount", 0);
        setIntField(term290962, term290962.getClass(), "winCount", 0);
        setIntField(term290962, term290962.getClass(), "helpCount", 0);
        setIntField(term290962, term290962.getClass(), "comboCount", 0);
        setLongField(term290962, term290962.getClass(), "totalDeluxscore", 0L);
        setLongField(term290962, term290962.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290962, term290962.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290962, term290962.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290962, term290962.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290962, term290962.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290962, term290962.getClass(), "totalSync", 0);
        setIntField(term290962, term290962.getClass(), "totalBasicSync", 0);
        setIntField(term290962, term290962.getClass(), "totalAdvancedSync", 0);
        setIntField(term290962, term290962.getClass(), "totalExpertSync", 0);
        setIntField(term290962, term290962.getClass(), "totalMasterSync", 0);
        setIntField(term290962, term290962.getClass(), "totalReMasterSync", 0);
        setLongField(term290962, term290962.getClass(), "totalAchievement", 0L);
        setLongField(term290962, term290962.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290962, term290962.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290962, term290962.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290962, term290962.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290962, term290962.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290962, term290962.getClass(), "playerOldRating", 0L);
        setLongField(term290962, term290962.getClass(), "playerNewRating", 0L);
        setIntField(term290962, term290962.getClass(), "banState", 0);
        setLongField(term290962, term290962.getClass(), "dateTime", 0L);
        term291017 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291017;
        callMethod(klass, "setTotalAwake", argTypes, term290962, args);
    }

};


