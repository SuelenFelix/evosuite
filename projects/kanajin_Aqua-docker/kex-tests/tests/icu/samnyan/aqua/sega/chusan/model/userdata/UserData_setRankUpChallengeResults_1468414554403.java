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

public class UserData_setRankUpChallengeResults_1468414554403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292753;

    public UserData_setRankUpChallengeResults_1468414554403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292753 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292753, term292753.getClass(), "id", 0L);
        setField(term292753, term292753.getClass(), "card", null);
        setField(term292753, term292753.getClass(), "userName", null);
        setIntField(term292753, term292753.getClass(), "level", 0);
        setIntField(term292753, term292753.getClass(), "reincarnationNum", 0);
        setField(term292753, term292753.getClass(), "exp", null);
        setLongField(term292753, term292753.getClass(), "point", 0L);
        setLongField(term292753, term292753.getClass(), "totalPoint", 0L);
        setIntField(term292753, term292753.getClass(), "playCount", 0);
        setIntField(term292753, term292753.getClass(), "multiPlayCount", 0);
        setIntField(term292753, term292753.getClass(), "playerRating", 0);
        setIntField(term292753, term292753.getClass(), "highestRating", 0);
        setIntField(term292753, term292753.getClass(), "nameplateId", 0);
        setIntField(term292753, term292753.getClass(), "frameId", 0);
        setIntField(term292753, term292753.getClass(), "characterId", 0);
        setIntField(term292753, term292753.getClass(), "trophyId", 0);
        setIntField(term292753, term292753.getClass(), "playedTutorialBit", 0);
        setIntField(term292753, term292753.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292753, term292753.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292753, term292753.getClass(), "totalMapNum", 0);
        setLongField(term292753, term292753.getClass(), "totalHiScore", 0L);
        setLongField(term292753, term292753.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292753, term292753.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292753, term292753.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292753, term292753.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292753, term292753.getClass(), "totalUltimaHighScore", 0L);
        setField(term292753, term292753.getClass(), "eventWatchedDate", null);
        setIntField(term292753, term292753.getClass(), "friendCount", 0);
        setField(term292753, term292753.getClass(), "firstGameId", null);
        setField(term292753, term292753.getClass(), "firstRomVersion", null);
        setField(term292753, term292753.getClass(), "firstDataVersion", null);
        setField(term292753, term292753.getClass(), "firstPlayDate", null);
        setField(term292753, term292753.getClass(), "lastGameId", null);
        setField(term292753, term292753.getClass(), "lastRomVersion", null);
        setField(term292753, term292753.getClass(), "lastDataVersion", null);
        setField(term292753, term292753.getClass(), "lastLoginDate", null);
        setField(term292753, term292753.getClass(), "lastPlayDate", null);
        setIntField(term292753, term292753.getClass(), "lastPlaceId", 0);
        setField(term292753, term292753.getClass(), "lastPlaceName", null);
        setField(term292753, term292753.getClass(), "lastRegionId", null);
        setField(term292753, term292753.getClass(), "lastRegionName", null);
        setField(term292753, term292753.getClass(), "lastAllNetId", null);
        setField(term292753, term292753.getClass(), "lastClientId", null);
        setField(term292753, term292753.getClass(), "lastCountryCode", null);
        setField(term292753, term292753.getClass(), "userNameEx", null);
        setField(term292753, term292753.getClass(), "compatibleCmVersion", null);
        setIntField(term292753, term292753.getClass(), "medal", 0);
        setIntField(term292753, term292753.getClass(), "mapIconId", 0);
        setIntField(term292753, term292753.getClass(), "voiceId", 0);
        setIntField(term292753, term292753.getClass(), "avatarWear", 0);
        setIntField(term292753, term292753.getClass(), "avatarHead", 0);
        setIntField(term292753, term292753.getClass(), "avatarFace", 0);
        setIntField(term292753, term292753.getClass(), "avatarSkin", 0);
        setIntField(term292753, term292753.getClass(), "avatarItem", 0);
        setIntField(term292753, term292753.getClass(), "avatarFront", 0);
        setIntField(term292753, term292753.getClass(), "avatarBack", 0);
        setIntField(term292753, term292753.getClass(), "classEmblemBase", 0);
        setIntField(term292753, term292753.getClass(), "classEmblemMedal", 0);
        setIntField(term292753, term292753.getClass(), "stockedGridCount", 0);
        setIntField(term292753, term292753.getClass(), "exMapLoopCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattlePlayCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattleWinCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattleLoseCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292753, term292753.getClass(), "charaIllustId", 0);
        setIntField(term292753, term292753.getClass(), "skillId", 0);
        setIntField(term292753, term292753.getClass(), "overPowerPoint", 0);
        setIntField(term292753, term292753.getClass(), "overPowerRate", 0);
        setIntField(term292753, term292753.getClass(), "overPowerLowerRank", 0);
        setIntField(term292753, term292753.getClass(), "avatarPoint", 0);
        setIntField(term292753, term292753.getClass(), "battleRankId", 0);
        setIntField(term292753, term292753.getClass(), "battleRankPoint", 0);
        setIntField(term292753, term292753.getClass(), "eliteRankPoint", 0);
        setIntField(term292753, term292753.getClass(), "netBattle1stCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattle2ndCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattle3rdCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattle4thCount", 0);
        setIntField(term292753, term292753.getClass(), "netBattleCorrection", 0);
        setIntField(term292753, term292753.getClass(), "netBattleErrCnt", 0);
        setIntField(term292753, term292753.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292753, term292753.getClass(), "battleRewardStatus", 0);
        setIntField(term292753, term292753.getClass(), "battleRewardIndex", 0);
        setIntField(term292753, term292753.getClass(), "battleRewardCount", 0);
        setIntField(term292753, term292753.getClass(), "ext1", 0);
        setIntField(term292753, term292753.getClass(), "ext2", 0);
        setIntField(term292753, term292753.getClass(), "ext3", 0);
        setIntField(term292753, term292753.getClass(), "ext4", 0);
        setIntField(term292753, term292753.getClass(), "ext5", 0);
        setIntField(term292753, term292753.getClass(), "ext6", 0);
        setIntField(term292753, term292753.getClass(), "ext7", 0);
        setIntField(term292753, term292753.getClass(), "ext8", 0);
        setIntField(term292753, term292753.getClass(), "ext9", 0);
        setIntField(term292753, term292753.getClass(), "ext10", 0);
        setField(term292753, term292753.getClass(), "extStr1", null);
        setField(term292753, term292753.getClass(), "extStr2", null);
        setLongField(term292753, term292753.getClass(), "extLong1", 0L);
        setLongField(term292753, term292753.getClass(), "extLong2", 0L);
        setField(term292753, term292753.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292753, term292753.getClass(), "isNetBattleHost", false);
        setIntField(term292753, term292753.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRankUpChallengeResults", argTypes, term292753, args);
    }

};


