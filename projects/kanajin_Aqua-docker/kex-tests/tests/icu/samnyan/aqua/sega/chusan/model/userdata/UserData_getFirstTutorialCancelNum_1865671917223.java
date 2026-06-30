package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getFirstTutorialCancelNum_1865671917223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278745;

    public UserData_getFirstTutorialCancelNum_1865671917223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278745 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278745, term278745.getClass(), "id", 0L);
        setField(term278745, term278745.getClass(), "card", null);
        setField(term278745, term278745.getClass(), "userName", null);
        setIntField(term278745, term278745.getClass(), "level", 0);
        setIntField(term278745, term278745.getClass(), "reincarnationNum", 0);
        setField(term278745, term278745.getClass(), "exp", null);
        setLongField(term278745, term278745.getClass(), "point", 0L);
        setLongField(term278745, term278745.getClass(), "totalPoint", 0L);
        setIntField(term278745, term278745.getClass(), "playCount", 0);
        setIntField(term278745, term278745.getClass(), "multiPlayCount", 0);
        setIntField(term278745, term278745.getClass(), "playerRating", 0);
        setIntField(term278745, term278745.getClass(), "highestRating", 0);
        setIntField(term278745, term278745.getClass(), "nameplateId", 0);
        setIntField(term278745, term278745.getClass(), "frameId", 0);
        setIntField(term278745, term278745.getClass(), "characterId", 0);
        setIntField(term278745, term278745.getClass(), "trophyId", 0);
        setIntField(term278745, term278745.getClass(), "playedTutorialBit", 0);
        setIntField(term278745, term278745.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278745, term278745.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278745, term278745.getClass(), "totalMapNum", 0);
        setLongField(term278745, term278745.getClass(), "totalHiScore", 0L);
        setLongField(term278745, term278745.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278745, term278745.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278745, term278745.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278745, term278745.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278745, term278745.getClass(), "totalUltimaHighScore", 0L);
        setField(term278745, term278745.getClass(), "eventWatchedDate", null);
        setIntField(term278745, term278745.getClass(), "friendCount", 0);
        setField(term278745, term278745.getClass(), "firstGameId", null);
        setField(term278745, term278745.getClass(), "firstRomVersion", null);
        setField(term278745, term278745.getClass(), "firstDataVersion", null);
        setField(term278745, term278745.getClass(), "firstPlayDate", null);
        setField(term278745, term278745.getClass(), "lastGameId", null);
        setField(term278745, term278745.getClass(), "lastRomVersion", null);
        setField(term278745, term278745.getClass(), "lastDataVersion", null);
        setField(term278745, term278745.getClass(), "lastLoginDate", null);
        setField(term278745, term278745.getClass(), "lastPlayDate", null);
        setIntField(term278745, term278745.getClass(), "lastPlaceId", 0);
        setField(term278745, term278745.getClass(), "lastPlaceName", null);
        setField(term278745, term278745.getClass(), "lastRegionId", null);
        setField(term278745, term278745.getClass(), "lastRegionName", null);
        setField(term278745, term278745.getClass(), "lastAllNetId", null);
        setField(term278745, term278745.getClass(), "lastClientId", null);
        setField(term278745, term278745.getClass(), "lastCountryCode", null);
        setField(term278745, term278745.getClass(), "userNameEx", null);
        setField(term278745, term278745.getClass(), "compatibleCmVersion", null);
        setIntField(term278745, term278745.getClass(), "medal", 0);
        setIntField(term278745, term278745.getClass(), "mapIconId", 0);
        setIntField(term278745, term278745.getClass(), "voiceId", 0);
        setIntField(term278745, term278745.getClass(), "avatarWear", 0);
        setIntField(term278745, term278745.getClass(), "avatarHead", 0);
        setIntField(term278745, term278745.getClass(), "avatarFace", 0);
        setIntField(term278745, term278745.getClass(), "avatarSkin", 0);
        setIntField(term278745, term278745.getClass(), "avatarItem", 0);
        setIntField(term278745, term278745.getClass(), "avatarFront", 0);
        setIntField(term278745, term278745.getClass(), "avatarBack", 0);
        setIntField(term278745, term278745.getClass(), "classEmblemBase", 0);
        setIntField(term278745, term278745.getClass(), "classEmblemMedal", 0);
        setIntField(term278745, term278745.getClass(), "stockedGridCount", 0);
        setIntField(term278745, term278745.getClass(), "exMapLoopCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattlePlayCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattleWinCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattleLoseCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278745, term278745.getClass(), "charaIllustId", 0);
        setIntField(term278745, term278745.getClass(), "skillId", 0);
        setIntField(term278745, term278745.getClass(), "overPowerPoint", 0);
        setIntField(term278745, term278745.getClass(), "overPowerRate", 0);
        setIntField(term278745, term278745.getClass(), "overPowerLowerRank", 0);
        setIntField(term278745, term278745.getClass(), "avatarPoint", 0);
        setIntField(term278745, term278745.getClass(), "battleRankId", 0);
        setIntField(term278745, term278745.getClass(), "battleRankPoint", 0);
        setIntField(term278745, term278745.getClass(), "eliteRankPoint", 0);
        setIntField(term278745, term278745.getClass(), "netBattle1stCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattle2ndCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattle3rdCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattle4thCount", 0);
        setIntField(term278745, term278745.getClass(), "netBattleCorrection", 0);
        setIntField(term278745, term278745.getClass(), "netBattleErrCnt", 0);
        setIntField(term278745, term278745.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278745, term278745.getClass(), "battleRewardStatus", 0);
        setIntField(term278745, term278745.getClass(), "battleRewardIndex", 0);
        setIntField(term278745, term278745.getClass(), "battleRewardCount", 0);
        setIntField(term278745, term278745.getClass(), "ext1", 0);
        setIntField(term278745, term278745.getClass(), "ext2", 0);
        setIntField(term278745, term278745.getClass(), "ext3", 0);
        setIntField(term278745, term278745.getClass(), "ext4", 0);
        setIntField(term278745, term278745.getClass(), "ext5", 0);
        setIntField(term278745, term278745.getClass(), "ext6", 0);
        setIntField(term278745, term278745.getClass(), "ext7", 0);
        setIntField(term278745, term278745.getClass(), "ext8", 0);
        setIntField(term278745, term278745.getClass(), "ext9", 0);
        setIntField(term278745, term278745.getClass(), "ext10", 0);
        setField(term278745, term278745.getClass(), "extStr1", null);
        setField(term278745, term278745.getClass(), "extStr2", null);
        setLongField(term278745, term278745.getClass(), "extLong1", 0L);
        setLongField(term278745, term278745.getClass(), "extLong2", 0L);
        setField(term278745, term278745.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278745, term278745.getClass(), "isNetBattleHost", false);
        setIntField(term278745, term278745.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstTutorialCancelNum", argTypes, term278745, args);
    }

};


