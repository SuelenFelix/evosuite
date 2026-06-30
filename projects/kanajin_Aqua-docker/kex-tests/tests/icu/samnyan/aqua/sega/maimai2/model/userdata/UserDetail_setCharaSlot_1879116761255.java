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

public class UserDetail_setCharaSlot_1879116761255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291418;

    public UserDetail_setCharaSlot_1879116761255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291418 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291418, term291418.getClass(), "id", 0L);
        setField(term291418, term291418.getClass(), "card", null);
        setField(term291418, term291418.getClass(), "userName", null);
        setIntField(term291418, term291418.getClass(), "isNetMember", 0);
        setIntField(term291418, term291418.getClass(), "iconId", 0);
        setIntField(term291418, term291418.getClass(), "plateId", 0);
        setIntField(term291418, term291418.getClass(), "titleId", 0);
        setIntField(term291418, term291418.getClass(), "partnerId", 0);
        setIntField(term291418, term291418.getClass(), "frameId", 0);
        setIntField(term291418, term291418.getClass(), "selectMapId", 0);
        setIntField(term291418, term291418.getClass(), "totalAwake", 0);
        setIntField(term291418, term291418.getClass(), "gradeRating", 0);
        setIntField(term291418, term291418.getClass(), "musicRating", 0);
        setIntField(term291418, term291418.getClass(), "playerRating", 0);
        setIntField(term291418, term291418.getClass(), "highestRating", 0);
        setIntField(term291418, term291418.getClass(), "gradeRank", 0);
        setIntField(term291418, term291418.getClass(), "classRank", 0);
        setIntField(term291418, term291418.getClass(), "courseRank", 0);
        setField(term291418, term291418.getClass(), "charaSlot", null);
        setField(term291418, term291418.getClass(), "charaLockSlot", null);
        setLongField(term291418, term291418.getClass(), "contentBit", 0L);
        setIntField(term291418, term291418.getClass(), "playCount", 0);
        setField(term291418, term291418.getClass(), "eventWatchedDate", null);
        setField(term291418, term291418.getClass(), "lastGameId", null);
        setField(term291418, term291418.getClass(), "lastRomVersion", null);
        setField(term291418, term291418.getClass(), "lastDataVersion", null);
        setField(term291418, term291418.getClass(), "lastLoginDate", null);
        setField(term291418, term291418.getClass(), "lastPlayDate", null);
        setIntField(term291418, term291418.getClass(), "lastPlayCredit", 0);
        setIntField(term291418, term291418.getClass(), "lastPlayMode", 0);
        setIntField(term291418, term291418.getClass(), "lastPlaceId", 0);
        setField(term291418, term291418.getClass(), "lastPlaceName", null);
        setIntField(term291418, term291418.getClass(), "lastAllNetId", 0);
        setIntField(term291418, term291418.getClass(), "lastRegionId", 0);
        setField(term291418, term291418.getClass(), "lastRegionName", null);
        setField(term291418, term291418.getClass(), "lastClientId", null);
        setField(term291418, term291418.getClass(), "lastCountryCode", null);
        setIntField(term291418, term291418.getClass(), "lastSelectEMoney", 0);
        setIntField(term291418, term291418.getClass(), "lastSelectTicket", 0);
        setIntField(term291418, term291418.getClass(), "lastSelectCourse", 0);
        setIntField(term291418, term291418.getClass(), "lastCountCourse", 0);
        setField(term291418, term291418.getClass(), "firstGameId", null);
        setField(term291418, term291418.getClass(), "firstRomVersion", null);
        setField(term291418, term291418.getClass(), "firstDataVersion", null);
        setField(term291418, term291418.getClass(), "firstPlayDate", null);
        setField(term291418, term291418.getClass(), "compatibleCmVersion", null);
        setField(term291418, term291418.getClass(), "dailyBonusDate", null);
        setField(term291418, term291418.getClass(), "dailyCourseBonusDate", null);
        setField(term291418, term291418.getClass(), "lastPairLoginDate", null);
        setField(term291418, term291418.getClass(), "lastTrialPlayDate", null);
        setIntField(term291418, term291418.getClass(), "playVsCount", 0);
        setIntField(term291418, term291418.getClass(), "playSyncCount", 0);
        setIntField(term291418, term291418.getClass(), "winCount", 0);
        setIntField(term291418, term291418.getClass(), "helpCount", 0);
        setIntField(term291418, term291418.getClass(), "comboCount", 0);
        setLongField(term291418, term291418.getClass(), "totalDeluxscore", 0L);
        setLongField(term291418, term291418.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291418, term291418.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291418, term291418.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291418, term291418.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291418, term291418.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291418, term291418.getClass(), "totalSync", 0);
        setIntField(term291418, term291418.getClass(), "totalBasicSync", 0);
        setIntField(term291418, term291418.getClass(), "totalAdvancedSync", 0);
        setIntField(term291418, term291418.getClass(), "totalExpertSync", 0);
        setIntField(term291418, term291418.getClass(), "totalMasterSync", 0);
        setIntField(term291418, term291418.getClass(), "totalReMasterSync", 0);
        setLongField(term291418, term291418.getClass(), "totalAchievement", 0L);
        setLongField(term291418, term291418.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291418, term291418.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291418, term291418.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291418, term291418.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291418, term291418.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291418, term291418.getClass(), "playerOldRating", 0L);
        setLongField(term291418, term291418.getClass(), "playerNewRating", 0L);
        setIntField(term291418, term291418.getClass(), "banState", 0);
        setLongField(term291418, term291418.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCharaSlot", argTypes, term291418, args);
    }

};


