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
import java.lang.Long;

public class UserData_setId_1614603660307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219737;
     Object term4219814;

    public UserData_setId_1614603660307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219737 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4219737, term4219737.getClass(), "id", 0L);
        setField(term4219737, term4219737.getClass(), "card", null);
        setField(term4219737, term4219737.getClass(), "userName", null);
        setIntField(term4219737, term4219737.getClass(), "level", 0);
        setIntField(term4219737, term4219737.getClass(), "reincarnationNum", 0);
        setField(term4219737, term4219737.getClass(), "exp", null);
        setLongField(term4219737, term4219737.getClass(), "point", 0L);
        setLongField(term4219737, term4219737.getClass(), "totalPoint", 0L);
        setIntField(term4219737, term4219737.getClass(), "playCount", 0);
        setIntField(term4219737, term4219737.getClass(), "multiPlayCount", 0);
        setIntField(term4219737, term4219737.getClass(), "playerRating", 0);
        setIntField(term4219737, term4219737.getClass(), "highestRating", 0);
        setIntField(term4219737, term4219737.getClass(), "nameplateId", 0);
        setIntField(term4219737, term4219737.getClass(), "frameId", 0);
        setIntField(term4219737, term4219737.getClass(), "characterId", 0);
        setIntField(term4219737, term4219737.getClass(), "trophyId", 0);
        setIntField(term4219737, term4219737.getClass(), "playedTutorialBit", 0);
        setIntField(term4219737, term4219737.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4219737, term4219737.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4219737, term4219737.getClass(), "totalMapNum", 0);
        setLongField(term4219737, term4219737.getClass(), "totalHiScore", 0L);
        setLongField(term4219737, term4219737.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4219737, term4219737.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4219737, term4219737.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4219737, term4219737.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4219737, term4219737.getClass(), "totalUltimaHighScore", 0L);
        setField(term4219737, term4219737.getClass(), "eventWatchedDate", null);
        setIntField(term4219737, term4219737.getClass(), "friendCount", 0);
        setField(term4219737, term4219737.getClass(), "firstGameId", null);
        setField(term4219737, term4219737.getClass(), "firstRomVersion", null);
        setField(term4219737, term4219737.getClass(), "firstDataVersion", null);
        setField(term4219737, term4219737.getClass(), "firstPlayDate", null);
        setField(term4219737, term4219737.getClass(), "lastGameId", null);
        setField(term4219737, term4219737.getClass(), "lastRomVersion", null);
        setField(term4219737, term4219737.getClass(), "lastDataVersion", null);
        setField(term4219737, term4219737.getClass(), "lastLoginDate", null);
        setField(term4219737, term4219737.getClass(), "lastPlayDate", null);
        setIntField(term4219737, term4219737.getClass(), "lastPlaceId", 0);
        setField(term4219737, term4219737.getClass(), "lastPlaceName", null);
        setField(term4219737, term4219737.getClass(), "lastRegionId", null);
        setField(term4219737, term4219737.getClass(), "lastRegionName", null);
        setField(term4219737, term4219737.getClass(), "lastAllNetId", null);
        setField(term4219737, term4219737.getClass(), "lastClientId", null);
        setField(term4219737, term4219737.getClass(), "lastCountryCode", null);
        setField(term4219737, term4219737.getClass(), "userNameEx", null);
        setField(term4219737, term4219737.getClass(), "compatibleCmVersion", null);
        setIntField(term4219737, term4219737.getClass(), "medal", 0);
        setIntField(term4219737, term4219737.getClass(), "mapIconId", 0);
        setIntField(term4219737, term4219737.getClass(), "voiceId", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarWear", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarHead", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarFace", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarSkin", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarItem", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarFront", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarBack", 0);
        setIntField(term4219737, term4219737.getClass(), "classEmblemBase", 0);
        setIntField(term4219737, term4219737.getClass(), "classEmblemMedal", 0);
        setIntField(term4219737, term4219737.getClass(), "stockedGridCount", 0);
        setIntField(term4219737, term4219737.getClass(), "exMapLoopCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattlePlayCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattleWinCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattleLoseCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4219737, term4219737.getClass(), "charaIllustId", 0);
        setIntField(term4219737, term4219737.getClass(), "skillId", 0);
        setIntField(term4219737, term4219737.getClass(), "overPowerPoint", 0);
        setIntField(term4219737, term4219737.getClass(), "overPowerRate", 0);
        setIntField(term4219737, term4219737.getClass(), "overPowerLowerRank", 0);
        setIntField(term4219737, term4219737.getClass(), "avatarPoint", 0);
        setIntField(term4219737, term4219737.getClass(), "battleRankId", 0);
        setIntField(term4219737, term4219737.getClass(), "battleRankPoint", 0);
        setIntField(term4219737, term4219737.getClass(), "eliteRankPoint", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattle1stCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattle2ndCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattle3rdCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattle4thCount", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattleCorrection", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattleErrCnt", 0);
        setIntField(term4219737, term4219737.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4219737, term4219737.getClass(), "battleRewardStatus", 0);
        setIntField(term4219737, term4219737.getClass(), "battleRewardIndex", 0);
        setIntField(term4219737, term4219737.getClass(), "battleRewardCount", 0);
        setIntField(term4219737, term4219737.getClass(), "ext1", 0);
        setIntField(term4219737, term4219737.getClass(), "ext2", 0);
        setIntField(term4219737, term4219737.getClass(), "ext3", 0);
        setIntField(term4219737, term4219737.getClass(), "ext4", 0);
        setIntField(term4219737, term4219737.getClass(), "ext5", 0);
        setIntField(term4219737, term4219737.getClass(), "ext6", 0);
        setIntField(term4219737, term4219737.getClass(), "ext7", 0);
        setIntField(term4219737, term4219737.getClass(), "ext8", 0);
        setIntField(term4219737, term4219737.getClass(), "ext9", 0);
        setIntField(term4219737, term4219737.getClass(), "ext10", 0);
        setField(term4219737, term4219737.getClass(), "extStr1", null);
        setField(term4219737, term4219737.getClass(), "extStr2", null);
        setLongField(term4219737, term4219737.getClass(), "extLong1", 0L);
        setLongField(term4219737, term4219737.getClass(), "extLong2", 0L);
        setField(term4219737, term4219737.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4219737, term4219737.getClass(), "isNetBattleHost", false);
        setIntField(term4219737, term4219737.getClass(), "netBattleEndState", 0);
        term4219814 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4219814;
        callMethod(klass, "setId", argTypes, term4219737, args);
    }

};


