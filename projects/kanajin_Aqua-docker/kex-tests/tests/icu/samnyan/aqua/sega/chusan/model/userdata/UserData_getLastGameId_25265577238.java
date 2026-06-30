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

public class UserData_getLastGameId_25265577238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279900;

    public UserData_getLastGameId_25265577238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279900 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term279900, term279900.getClass(), "id", 0L);
        setField(term279900, term279900.getClass(), "card", null);
        setField(term279900, term279900.getClass(), "userName", null);
        setIntField(term279900, term279900.getClass(), "level", 0);
        setIntField(term279900, term279900.getClass(), "reincarnationNum", 0);
        setField(term279900, term279900.getClass(), "exp", null);
        setLongField(term279900, term279900.getClass(), "point", 0L);
        setLongField(term279900, term279900.getClass(), "totalPoint", 0L);
        setIntField(term279900, term279900.getClass(), "playCount", 0);
        setIntField(term279900, term279900.getClass(), "multiPlayCount", 0);
        setIntField(term279900, term279900.getClass(), "playerRating", 0);
        setIntField(term279900, term279900.getClass(), "highestRating", 0);
        setIntField(term279900, term279900.getClass(), "nameplateId", 0);
        setIntField(term279900, term279900.getClass(), "frameId", 0);
        setIntField(term279900, term279900.getClass(), "characterId", 0);
        setIntField(term279900, term279900.getClass(), "trophyId", 0);
        setIntField(term279900, term279900.getClass(), "playedTutorialBit", 0);
        setIntField(term279900, term279900.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term279900, term279900.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term279900, term279900.getClass(), "totalMapNum", 0);
        setLongField(term279900, term279900.getClass(), "totalHiScore", 0L);
        setLongField(term279900, term279900.getClass(), "totalBasicHighScore", 0L);
        setLongField(term279900, term279900.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term279900, term279900.getClass(), "totalExpertHighScore", 0L);
        setLongField(term279900, term279900.getClass(), "totalMasterHighScore", 0L);
        setLongField(term279900, term279900.getClass(), "totalUltimaHighScore", 0L);
        setField(term279900, term279900.getClass(), "eventWatchedDate", null);
        setIntField(term279900, term279900.getClass(), "friendCount", 0);
        setField(term279900, term279900.getClass(), "firstGameId", null);
        setField(term279900, term279900.getClass(), "firstRomVersion", null);
        setField(term279900, term279900.getClass(), "firstDataVersion", null);
        setField(term279900, term279900.getClass(), "firstPlayDate", null);
        setField(term279900, term279900.getClass(), "lastGameId", null);
        setField(term279900, term279900.getClass(), "lastRomVersion", null);
        setField(term279900, term279900.getClass(), "lastDataVersion", null);
        setField(term279900, term279900.getClass(), "lastLoginDate", null);
        setField(term279900, term279900.getClass(), "lastPlayDate", null);
        setIntField(term279900, term279900.getClass(), "lastPlaceId", 0);
        setField(term279900, term279900.getClass(), "lastPlaceName", null);
        setField(term279900, term279900.getClass(), "lastRegionId", null);
        setField(term279900, term279900.getClass(), "lastRegionName", null);
        setField(term279900, term279900.getClass(), "lastAllNetId", null);
        setField(term279900, term279900.getClass(), "lastClientId", null);
        setField(term279900, term279900.getClass(), "lastCountryCode", null);
        setField(term279900, term279900.getClass(), "userNameEx", null);
        setField(term279900, term279900.getClass(), "compatibleCmVersion", null);
        setIntField(term279900, term279900.getClass(), "medal", 0);
        setIntField(term279900, term279900.getClass(), "mapIconId", 0);
        setIntField(term279900, term279900.getClass(), "voiceId", 0);
        setIntField(term279900, term279900.getClass(), "avatarWear", 0);
        setIntField(term279900, term279900.getClass(), "avatarHead", 0);
        setIntField(term279900, term279900.getClass(), "avatarFace", 0);
        setIntField(term279900, term279900.getClass(), "avatarSkin", 0);
        setIntField(term279900, term279900.getClass(), "avatarItem", 0);
        setIntField(term279900, term279900.getClass(), "avatarFront", 0);
        setIntField(term279900, term279900.getClass(), "avatarBack", 0);
        setIntField(term279900, term279900.getClass(), "classEmblemBase", 0);
        setIntField(term279900, term279900.getClass(), "classEmblemMedal", 0);
        setIntField(term279900, term279900.getClass(), "stockedGridCount", 0);
        setIntField(term279900, term279900.getClass(), "exMapLoopCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattlePlayCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattleWinCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattleLoseCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term279900, term279900.getClass(), "charaIllustId", 0);
        setIntField(term279900, term279900.getClass(), "skillId", 0);
        setIntField(term279900, term279900.getClass(), "overPowerPoint", 0);
        setIntField(term279900, term279900.getClass(), "overPowerRate", 0);
        setIntField(term279900, term279900.getClass(), "overPowerLowerRank", 0);
        setIntField(term279900, term279900.getClass(), "avatarPoint", 0);
        setIntField(term279900, term279900.getClass(), "battleRankId", 0);
        setIntField(term279900, term279900.getClass(), "battleRankPoint", 0);
        setIntField(term279900, term279900.getClass(), "eliteRankPoint", 0);
        setIntField(term279900, term279900.getClass(), "netBattle1stCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattle2ndCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattle3rdCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattle4thCount", 0);
        setIntField(term279900, term279900.getClass(), "netBattleCorrection", 0);
        setIntField(term279900, term279900.getClass(), "netBattleErrCnt", 0);
        setIntField(term279900, term279900.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term279900, term279900.getClass(), "battleRewardStatus", 0);
        setIntField(term279900, term279900.getClass(), "battleRewardIndex", 0);
        setIntField(term279900, term279900.getClass(), "battleRewardCount", 0);
        setIntField(term279900, term279900.getClass(), "ext1", 0);
        setIntField(term279900, term279900.getClass(), "ext2", 0);
        setIntField(term279900, term279900.getClass(), "ext3", 0);
        setIntField(term279900, term279900.getClass(), "ext4", 0);
        setIntField(term279900, term279900.getClass(), "ext5", 0);
        setIntField(term279900, term279900.getClass(), "ext6", 0);
        setIntField(term279900, term279900.getClass(), "ext7", 0);
        setIntField(term279900, term279900.getClass(), "ext8", 0);
        setIntField(term279900, term279900.getClass(), "ext9", 0);
        setIntField(term279900, term279900.getClass(), "ext10", 0);
        setField(term279900, term279900.getClass(), "extStr1", null);
        setField(term279900, term279900.getClass(), "extStr2", null);
        setLongField(term279900, term279900.getClass(), "extLong1", 0L);
        setLongField(term279900, term279900.getClass(), "extLong2", 0L);
        setField(term279900, term279900.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term279900, term279900.getClass(), "isNetBattleHost", false);
        setIntField(term279900, term279900.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term279900, args);
    }

};


