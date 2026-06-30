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

public class UserDetail_setPlayerRating_604856382250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291133;
     Object term291188;

    public UserDetail_setPlayerRating_604856382250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291133 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291133, term291133.getClass(), "id", 0L);
        setField(term291133, term291133.getClass(), "card", null);
        setField(term291133, term291133.getClass(), "userName", null);
        setIntField(term291133, term291133.getClass(), "isNetMember", 0);
        setIntField(term291133, term291133.getClass(), "iconId", 0);
        setIntField(term291133, term291133.getClass(), "plateId", 0);
        setIntField(term291133, term291133.getClass(), "titleId", 0);
        setIntField(term291133, term291133.getClass(), "partnerId", 0);
        setIntField(term291133, term291133.getClass(), "frameId", 0);
        setIntField(term291133, term291133.getClass(), "selectMapId", 0);
        setIntField(term291133, term291133.getClass(), "totalAwake", 0);
        setIntField(term291133, term291133.getClass(), "gradeRating", 0);
        setIntField(term291133, term291133.getClass(), "musicRating", 0);
        setIntField(term291133, term291133.getClass(), "playerRating", 0);
        setIntField(term291133, term291133.getClass(), "highestRating", 0);
        setIntField(term291133, term291133.getClass(), "gradeRank", 0);
        setIntField(term291133, term291133.getClass(), "classRank", 0);
        setIntField(term291133, term291133.getClass(), "courseRank", 0);
        setField(term291133, term291133.getClass(), "charaSlot", null);
        setField(term291133, term291133.getClass(), "charaLockSlot", null);
        setLongField(term291133, term291133.getClass(), "contentBit", 0L);
        setIntField(term291133, term291133.getClass(), "playCount", 0);
        setField(term291133, term291133.getClass(), "eventWatchedDate", null);
        setField(term291133, term291133.getClass(), "lastGameId", null);
        setField(term291133, term291133.getClass(), "lastRomVersion", null);
        setField(term291133, term291133.getClass(), "lastDataVersion", null);
        setField(term291133, term291133.getClass(), "lastLoginDate", null);
        setField(term291133, term291133.getClass(), "lastPlayDate", null);
        setIntField(term291133, term291133.getClass(), "lastPlayCredit", 0);
        setIntField(term291133, term291133.getClass(), "lastPlayMode", 0);
        setIntField(term291133, term291133.getClass(), "lastPlaceId", 0);
        setField(term291133, term291133.getClass(), "lastPlaceName", null);
        setIntField(term291133, term291133.getClass(), "lastAllNetId", 0);
        setIntField(term291133, term291133.getClass(), "lastRegionId", 0);
        setField(term291133, term291133.getClass(), "lastRegionName", null);
        setField(term291133, term291133.getClass(), "lastClientId", null);
        setField(term291133, term291133.getClass(), "lastCountryCode", null);
        setIntField(term291133, term291133.getClass(), "lastSelectEMoney", 0);
        setIntField(term291133, term291133.getClass(), "lastSelectTicket", 0);
        setIntField(term291133, term291133.getClass(), "lastSelectCourse", 0);
        setIntField(term291133, term291133.getClass(), "lastCountCourse", 0);
        setField(term291133, term291133.getClass(), "firstGameId", null);
        setField(term291133, term291133.getClass(), "firstRomVersion", null);
        setField(term291133, term291133.getClass(), "firstDataVersion", null);
        setField(term291133, term291133.getClass(), "firstPlayDate", null);
        setField(term291133, term291133.getClass(), "compatibleCmVersion", null);
        setField(term291133, term291133.getClass(), "dailyBonusDate", null);
        setField(term291133, term291133.getClass(), "dailyCourseBonusDate", null);
        setField(term291133, term291133.getClass(), "lastPairLoginDate", null);
        setField(term291133, term291133.getClass(), "lastTrialPlayDate", null);
        setIntField(term291133, term291133.getClass(), "playVsCount", 0);
        setIntField(term291133, term291133.getClass(), "playSyncCount", 0);
        setIntField(term291133, term291133.getClass(), "winCount", 0);
        setIntField(term291133, term291133.getClass(), "helpCount", 0);
        setIntField(term291133, term291133.getClass(), "comboCount", 0);
        setLongField(term291133, term291133.getClass(), "totalDeluxscore", 0L);
        setLongField(term291133, term291133.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291133, term291133.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291133, term291133.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291133, term291133.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291133, term291133.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291133, term291133.getClass(), "totalSync", 0);
        setIntField(term291133, term291133.getClass(), "totalBasicSync", 0);
        setIntField(term291133, term291133.getClass(), "totalAdvancedSync", 0);
        setIntField(term291133, term291133.getClass(), "totalExpertSync", 0);
        setIntField(term291133, term291133.getClass(), "totalMasterSync", 0);
        setIntField(term291133, term291133.getClass(), "totalReMasterSync", 0);
        setLongField(term291133, term291133.getClass(), "totalAchievement", 0L);
        setLongField(term291133, term291133.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291133, term291133.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291133, term291133.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291133, term291133.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291133, term291133.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291133, term291133.getClass(), "playerOldRating", 0L);
        setLongField(term291133, term291133.getClass(), "playerNewRating", 0L);
        setIntField(term291133, term291133.getClass(), "banState", 0);
        setLongField(term291133, term291133.getClass(), "dateTime", 0L);
        term291188 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291188;
        callMethod(klass, "setPlayerRating", argTypes, term291133, args);
    }

};


