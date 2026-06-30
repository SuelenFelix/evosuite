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

public class UserData_getBattleRankPoint_76179953277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282903;

    public UserData_getBattleRankPoint_76179953277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282903 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term282903, term282903.getClass(), "id", 0L);
        setField(term282903, term282903.getClass(), "card", null);
        setField(term282903, term282903.getClass(), "userName", null);
        setIntField(term282903, term282903.getClass(), "level", 0);
        setIntField(term282903, term282903.getClass(), "reincarnationNum", 0);
        setField(term282903, term282903.getClass(), "exp", null);
        setLongField(term282903, term282903.getClass(), "point", 0L);
        setLongField(term282903, term282903.getClass(), "totalPoint", 0L);
        setIntField(term282903, term282903.getClass(), "playCount", 0);
        setIntField(term282903, term282903.getClass(), "multiPlayCount", 0);
        setIntField(term282903, term282903.getClass(), "playerRating", 0);
        setIntField(term282903, term282903.getClass(), "highestRating", 0);
        setIntField(term282903, term282903.getClass(), "nameplateId", 0);
        setIntField(term282903, term282903.getClass(), "frameId", 0);
        setIntField(term282903, term282903.getClass(), "characterId", 0);
        setIntField(term282903, term282903.getClass(), "trophyId", 0);
        setIntField(term282903, term282903.getClass(), "playedTutorialBit", 0);
        setIntField(term282903, term282903.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term282903, term282903.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term282903, term282903.getClass(), "totalMapNum", 0);
        setLongField(term282903, term282903.getClass(), "totalHiScore", 0L);
        setLongField(term282903, term282903.getClass(), "totalBasicHighScore", 0L);
        setLongField(term282903, term282903.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term282903, term282903.getClass(), "totalExpertHighScore", 0L);
        setLongField(term282903, term282903.getClass(), "totalMasterHighScore", 0L);
        setLongField(term282903, term282903.getClass(), "totalUltimaHighScore", 0L);
        setField(term282903, term282903.getClass(), "eventWatchedDate", null);
        setIntField(term282903, term282903.getClass(), "friendCount", 0);
        setField(term282903, term282903.getClass(), "firstGameId", null);
        setField(term282903, term282903.getClass(), "firstRomVersion", null);
        setField(term282903, term282903.getClass(), "firstDataVersion", null);
        setField(term282903, term282903.getClass(), "firstPlayDate", null);
        setField(term282903, term282903.getClass(), "lastGameId", null);
        setField(term282903, term282903.getClass(), "lastRomVersion", null);
        setField(term282903, term282903.getClass(), "lastDataVersion", null);
        setField(term282903, term282903.getClass(), "lastLoginDate", null);
        setField(term282903, term282903.getClass(), "lastPlayDate", null);
        setIntField(term282903, term282903.getClass(), "lastPlaceId", 0);
        setField(term282903, term282903.getClass(), "lastPlaceName", null);
        setField(term282903, term282903.getClass(), "lastRegionId", null);
        setField(term282903, term282903.getClass(), "lastRegionName", null);
        setField(term282903, term282903.getClass(), "lastAllNetId", null);
        setField(term282903, term282903.getClass(), "lastClientId", null);
        setField(term282903, term282903.getClass(), "lastCountryCode", null);
        setField(term282903, term282903.getClass(), "userNameEx", null);
        setField(term282903, term282903.getClass(), "compatibleCmVersion", null);
        setIntField(term282903, term282903.getClass(), "medal", 0);
        setIntField(term282903, term282903.getClass(), "mapIconId", 0);
        setIntField(term282903, term282903.getClass(), "voiceId", 0);
        setIntField(term282903, term282903.getClass(), "avatarWear", 0);
        setIntField(term282903, term282903.getClass(), "avatarHead", 0);
        setIntField(term282903, term282903.getClass(), "avatarFace", 0);
        setIntField(term282903, term282903.getClass(), "avatarSkin", 0);
        setIntField(term282903, term282903.getClass(), "avatarItem", 0);
        setIntField(term282903, term282903.getClass(), "avatarFront", 0);
        setIntField(term282903, term282903.getClass(), "avatarBack", 0);
        setIntField(term282903, term282903.getClass(), "classEmblemBase", 0);
        setIntField(term282903, term282903.getClass(), "classEmblemMedal", 0);
        setIntField(term282903, term282903.getClass(), "stockedGridCount", 0);
        setIntField(term282903, term282903.getClass(), "exMapLoopCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattlePlayCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattleWinCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattleLoseCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term282903, term282903.getClass(), "charaIllustId", 0);
        setIntField(term282903, term282903.getClass(), "skillId", 0);
        setIntField(term282903, term282903.getClass(), "overPowerPoint", 0);
        setIntField(term282903, term282903.getClass(), "overPowerRate", 0);
        setIntField(term282903, term282903.getClass(), "overPowerLowerRank", 0);
        setIntField(term282903, term282903.getClass(), "avatarPoint", 0);
        setIntField(term282903, term282903.getClass(), "battleRankId", 0);
        setIntField(term282903, term282903.getClass(), "battleRankPoint", 0);
        setIntField(term282903, term282903.getClass(), "eliteRankPoint", 0);
        setIntField(term282903, term282903.getClass(), "netBattle1stCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattle2ndCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattle3rdCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattle4thCount", 0);
        setIntField(term282903, term282903.getClass(), "netBattleCorrection", 0);
        setIntField(term282903, term282903.getClass(), "netBattleErrCnt", 0);
        setIntField(term282903, term282903.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term282903, term282903.getClass(), "battleRewardStatus", 0);
        setIntField(term282903, term282903.getClass(), "battleRewardIndex", 0);
        setIntField(term282903, term282903.getClass(), "battleRewardCount", 0);
        setIntField(term282903, term282903.getClass(), "ext1", 0);
        setIntField(term282903, term282903.getClass(), "ext2", 0);
        setIntField(term282903, term282903.getClass(), "ext3", 0);
        setIntField(term282903, term282903.getClass(), "ext4", 0);
        setIntField(term282903, term282903.getClass(), "ext5", 0);
        setIntField(term282903, term282903.getClass(), "ext6", 0);
        setIntField(term282903, term282903.getClass(), "ext7", 0);
        setIntField(term282903, term282903.getClass(), "ext8", 0);
        setIntField(term282903, term282903.getClass(), "ext9", 0);
        setIntField(term282903, term282903.getClass(), "ext10", 0);
        setField(term282903, term282903.getClass(), "extStr1", null);
        setField(term282903, term282903.getClass(), "extStr2", null);
        setLongField(term282903, term282903.getClass(), "extLong1", 0L);
        setLongField(term282903, term282903.getClass(), "extLong2", 0L);
        setField(term282903, term282903.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term282903, term282903.getClass(), "isNetBattleHost", false);
        setIntField(term282903, term282903.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleRankPoint", argTypes, term282903, args);
    }

};


