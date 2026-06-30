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

public class UserData_getBattleRankId_1142058318276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282826;

    public UserData_getBattleRankId_1142058318276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282826 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term282826, term282826.getClass(), "id", 0L);
        setField(term282826, term282826.getClass(), "card", null);
        setField(term282826, term282826.getClass(), "userName", null);
        setIntField(term282826, term282826.getClass(), "level", 0);
        setIntField(term282826, term282826.getClass(), "reincarnationNum", 0);
        setField(term282826, term282826.getClass(), "exp", null);
        setLongField(term282826, term282826.getClass(), "point", 0L);
        setLongField(term282826, term282826.getClass(), "totalPoint", 0L);
        setIntField(term282826, term282826.getClass(), "playCount", 0);
        setIntField(term282826, term282826.getClass(), "multiPlayCount", 0);
        setIntField(term282826, term282826.getClass(), "playerRating", 0);
        setIntField(term282826, term282826.getClass(), "highestRating", 0);
        setIntField(term282826, term282826.getClass(), "nameplateId", 0);
        setIntField(term282826, term282826.getClass(), "frameId", 0);
        setIntField(term282826, term282826.getClass(), "characterId", 0);
        setIntField(term282826, term282826.getClass(), "trophyId", 0);
        setIntField(term282826, term282826.getClass(), "playedTutorialBit", 0);
        setIntField(term282826, term282826.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term282826, term282826.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term282826, term282826.getClass(), "totalMapNum", 0);
        setLongField(term282826, term282826.getClass(), "totalHiScore", 0L);
        setLongField(term282826, term282826.getClass(), "totalBasicHighScore", 0L);
        setLongField(term282826, term282826.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term282826, term282826.getClass(), "totalExpertHighScore", 0L);
        setLongField(term282826, term282826.getClass(), "totalMasterHighScore", 0L);
        setLongField(term282826, term282826.getClass(), "totalUltimaHighScore", 0L);
        setField(term282826, term282826.getClass(), "eventWatchedDate", null);
        setIntField(term282826, term282826.getClass(), "friendCount", 0);
        setField(term282826, term282826.getClass(), "firstGameId", null);
        setField(term282826, term282826.getClass(), "firstRomVersion", null);
        setField(term282826, term282826.getClass(), "firstDataVersion", null);
        setField(term282826, term282826.getClass(), "firstPlayDate", null);
        setField(term282826, term282826.getClass(), "lastGameId", null);
        setField(term282826, term282826.getClass(), "lastRomVersion", null);
        setField(term282826, term282826.getClass(), "lastDataVersion", null);
        setField(term282826, term282826.getClass(), "lastLoginDate", null);
        setField(term282826, term282826.getClass(), "lastPlayDate", null);
        setIntField(term282826, term282826.getClass(), "lastPlaceId", 0);
        setField(term282826, term282826.getClass(), "lastPlaceName", null);
        setField(term282826, term282826.getClass(), "lastRegionId", null);
        setField(term282826, term282826.getClass(), "lastRegionName", null);
        setField(term282826, term282826.getClass(), "lastAllNetId", null);
        setField(term282826, term282826.getClass(), "lastClientId", null);
        setField(term282826, term282826.getClass(), "lastCountryCode", null);
        setField(term282826, term282826.getClass(), "userNameEx", null);
        setField(term282826, term282826.getClass(), "compatibleCmVersion", null);
        setIntField(term282826, term282826.getClass(), "medal", 0);
        setIntField(term282826, term282826.getClass(), "mapIconId", 0);
        setIntField(term282826, term282826.getClass(), "voiceId", 0);
        setIntField(term282826, term282826.getClass(), "avatarWear", 0);
        setIntField(term282826, term282826.getClass(), "avatarHead", 0);
        setIntField(term282826, term282826.getClass(), "avatarFace", 0);
        setIntField(term282826, term282826.getClass(), "avatarSkin", 0);
        setIntField(term282826, term282826.getClass(), "avatarItem", 0);
        setIntField(term282826, term282826.getClass(), "avatarFront", 0);
        setIntField(term282826, term282826.getClass(), "avatarBack", 0);
        setIntField(term282826, term282826.getClass(), "classEmblemBase", 0);
        setIntField(term282826, term282826.getClass(), "classEmblemMedal", 0);
        setIntField(term282826, term282826.getClass(), "stockedGridCount", 0);
        setIntField(term282826, term282826.getClass(), "exMapLoopCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattlePlayCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattleWinCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattleLoseCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term282826, term282826.getClass(), "charaIllustId", 0);
        setIntField(term282826, term282826.getClass(), "skillId", 0);
        setIntField(term282826, term282826.getClass(), "overPowerPoint", 0);
        setIntField(term282826, term282826.getClass(), "overPowerRate", 0);
        setIntField(term282826, term282826.getClass(), "overPowerLowerRank", 0);
        setIntField(term282826, term282826.getClass(), "avatarPoint", 0);
        setIntField(term282826, term282826.getClass(), "battleRankId", 0);
        setIntField(term282826, term282826.getClass(), "battleRankPoint", 0);
        setIntField(term282826, term282826.getClass(), "eliteRankPoint", 0);
        setIntField(term282826, term282826.getClass(), "netBattle1stCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattle2ndCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattle3rdCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattle4thCount", 0);
        setIntField(term282826, term282826.getClass(), "netBattleCorrection", 0);
        setIntField(term282826, term282826.getClass(), "netBattleErrCnt", 0);
        setIntField(term282826, term282826.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term282826, term282826.getClass(), "battleRewardStatus", 0);
        setIntField(term282826, term282826.getClass(), "battleRewardIndex", 0);
        setIntField(term282826, term282826.getClass(), "battleRewardCount", 0);
        setIntField(term282826, term282826.getClass(), "ext1", 0);
        setIntField(term282826, term282826.getClass(), "ext2", 0);
        setIntField(term282826, term282826.getClass(), "ext3", 0);
        setIntField(term282826, term282826.getClass(), "ext4", 0);
        setIntField(term282826, term282826.getClass(), "ext5", 0);
        setIntField(term282826, term282826.getClass(), "ext6", 0);
        setIntField(term282826, term282826.getClass(), "ext7", 0);
        setIntField(term282826, term282826.getClass(), "ext8", 0);
        setIntField(term282826, term282826.getClass(), "ext9", 0);
        setIntField(term282826, term282826.getClass(), "ext10", 0);
        setField(term282826, term282826.getClass(), "extStr1", null);
        setField(term282826, term282826.getClass(), "extStr2", null);
        setLongField(term282826, term282826.getClass(), "extLong1", 0L);
        setLongField(term282826, term282826.getClass(), "extLong2", 0L);
        setField(term282826, term282826.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term282826, term282826.getClass(), "isNetBattleHost", false);
        setIntField(term282826, term282826.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleRankId", argTypes, term282826, args);
    }

};


