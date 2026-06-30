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

public class UserDetail_setPartnerId_665159585244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290791;
     Object term290846;

    public UserDetail_setPartnerId_665159585244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290791 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290791, term290791.getClass(), "id", 0L);
        setField(term290791, term290791.getClass(), "card", null);
        setField(term290791, term290791.getClass(), "userName", null);
        setIntField(term290791, term290791.getClass(), "isNetMember", 0);
        setIntField(term290791, term290791.getClass(), "iconId", 0);
        setIntField(term290791, term290791.getClass(), "plateId", 0);
        setIntField(term290791, term290791.getClass(), "titleId", 0);
        setIntField(term290791, term290791.getClass(), "partnerId", 0);
        setIntField(term290791, term290791.getClass(), "frameId", 0);
        setIntField(term290791, term290791.getClass(), "selectMapId", 0);
        setIntField(term290791, term290791.getClass(), "totalAwake", 0);
        setIntField(term290791, term290791.getClass(), "gradeRating", 0);
        setIntField(term290791, term290791.getClass(), "musicRating", 0);
        setIntField(term290791, term290791.getClass(), "playerRating", 0);
        setIntField(term290791, term290791.getClass(), "highestRating", 0);
        setIntField(term290791, term290791.getClass(), "gradeRank", 0);
        setIntField(term290791, term290791.getClass(), "classRank", 0);
        setIntField(term290791, term290791.getClass(), "courseRank", 0);
        setField(term290791, term290791.getClass(), "charaSlot", null);
        setField(term290791, term290791.getClass(), "charaLockSlot", null);
        setLongField(term290791, term290791.getClass(), "contentBit", 0L);
        setIntField(term290791, term290791.getClass(), "playCount", 0);
        setField(term290791, term290791.getClass(), "eventWatchedDate", null);
        setField(term290791, term290791.getClass(), "lastGameId", null);
        setField(term290791, term290791.getClass(), "lastRomVersion", null);
        setField(term290791, term290791.getClass(), "lastDataVersion", null);
        setField(term290791, term290791.getClass(), "lastLoginDate", null);
        setField(term290791, term290791.getClass(), "lastPlayDate", null);
        setIntField(term290791, term290791.getClass(), "lastPlayCredit", 0);
        setIntField(term290791, term290791.getClass(), "lastPlayMode", 0);
        setIntField(term290791, term290791.getClass(), "lastPlaceId", 0);
        setField(term290791, term290791.getClass(), "lastPlaceName", null);
        setIntField(term290791, term290791.getClass(), "lastAllNetId", 0);
        setIntField(term290791, term290791.getClass(), "lastRegionId", 0);
        setField(term290791, term290791.getClass(), "lastRegionName", null);
        setField(term290791, term290791.getClass(), "lastClientId", null);
        setField(term290791, term290791.getClass(), "lastCountryCode", null);
        setIntField(term290791, term290791.getClass(), "lastSelectEMoney", 0);
        setIntField(term290791, term290791.getClass(), "lastSelectTicket", 0);
        setIntField(term290791, term290791.getClass(), "lastSelectCourse", 0);
        setIntField(term290791, term290791.getClass(), "lastCountCourse", 0);
        setField(term290791, term290791.getClass(), "firstGameId", null);
        setField(term290791, term290791.getClass(), "firstRomVersion", null);
        setField(term290791, term290791.getClass(), "firstDataVersion", null);
        setField(term290791, term290791.getClass(), "firstPlayDate", null);
        setField(term290791, term290791.getClass(), "compatibleCmVersion", null);
        setField(term290791, term290791.getClass(), "dailyBonusDate", null);
        setField(term290791, term290791.getClass(), "dailyCourseBonusDate", null);
        setField(term290791, term290791.getClass(), "lastPairLoginDate", null);
        setField(term290791, term290791.getClass(), "lastTrialPlayDate", null);
        setIntField(term290791, term290791.getClass(), "playVsCount", 0);
        setIntField(term290791, term290791.getClass(), "playSyncCount", 0);
        setIntField(term290791, term290791.getClass(), "winCount", 0);
        setIntField(term290791, term290791.getClass(), "helpCount", 0);
        setIntField(term290791, term290791.getClass(), "comboCount", 0);
        setLongField(term290791, term290791.getClass(), "totalDeluxscore", 0L);
        setLongField(term290791, term290791.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290791, term290791.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290791, term290791.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290791, term290791.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290791, term290791.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290791, term290791.getClass(), "totalSync", 0);
        setIntField(term290791, term290791.getClass(), "totalBasicSync", 0);
        setIntField(term290791, term290791.getClass(), "totalAdvancedSync", 0);
        setIntField(term290791, term290791.getClass(), "totalExpertSync", 0);
        setIntField(term290791, term290791.getClass(), "totalMasterSync", 0);
        setIntField(term290791, term290791.getClass(), "totalReMasterSync", 0);
        setLongField(term290791, term290791.getClass(), "totalAchievement", 0L);
        setLongField(term290791, term290791.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290791, term290791.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290791, term290791.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290791, term290791.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290791, term290791.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290791, term290791.getClass(), "playerOldRating", 0L);
        setLongField(term290791, term290791.getClass(), "playerNewRating", 0L);
        setIntField(term290791, term290791.getClass(), "banState", 0);
        setLongField(term290791, term290791.getClass(), "dateTime", 0L);
        term290846 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290846;
        callMethod(klass, "setPartnerId", argTypes, term290791, args);
    }

};


