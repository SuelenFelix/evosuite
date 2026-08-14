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
import java.lang.Integer;

public class UserData_setMultiPlayCount_1360401619316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220442;
     Object term4220519;

    public UserData_setMultiPlayCount_1360401619316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220442 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220442, term4220442.getClass(), "id", 0L);
        setField(term4220442, term4220442.getClass(), "card", null);
        setField(term4220442, term4220442.getClass(), "userName", null);
        setIntField(term4220442, term4220442.getClass(), "level", 0);
        setIntField(term4220442, term4220442.getClass(), "reincarnationNum", 0);
        setField(term4220442, term4220442.getClass(), "exp", null);
        setLongField(term4220442, term4220442.getClass(), "point", 0L);
        setLongField(term4220442, term4220442.getClass(), "totalPoint", 0L);
        setIntField(term4220442, term4220442.getClass(), "playCount", 0);
        setIntField(term4220442, term4220442.getClass(), "multiPlayCount", 0);
        setIntField(term4220442, term4220442.getClass(), "playerRating", 0);
        setIntField(term4220442, term4220442.getClass(), "highestRating", 0);
        setIntField(term4220442, term4220442.getClass(), "nameplateId", 0);
        setIntField(term4220442, term4220442.getClass(), "frameId", 0);
        setIntField(term4220442, term4220442.getClass(), "characterId", 0);
        setIntField(term4220442, term4220442.getClass(), "trophyId", 0);
        setIntField(term4220442, term4220442.getClass(), "playedTutorialBit", 0);
        setIntField(term4220442, term4220442.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220442, term4220442.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220442, term4220442.getClass(), "totalMapNum", 0);
        setLongField(term4220442, term4220442.getClass(), "totalHiScore", 0L);
        setLongField(term4220442, term4220442.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220442, term4220442.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220442, term4220442.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220442, term4220442.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220442, term4220442.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220442, term4220442.getClass(), "eventWatchedDate", null);
        setIntField(term4220442, term4220442.getClass(), "friendCount", 0);
        setField(term4220442, term4220442.getClass(), "firstGameId", null);
        setField(term4220442, term4220442.getClass(), "firstRomVersion", null);
        setField(term4220442, term4220442.getClass(), "firstDataVersion", null);
        setField(term4220442, term4220442.getClass(), "firstPlayDate", null);
        setField(term4220442, term4220442.getClass(), "lastGameId", null);
        setField(term4220442, term4220442.getClass(), "lastRomVersion", null);
        setField(term4220442, term4220442.getClass(), "lastDataVersion", null);
        setField(term4220442, term4220442.getClass(), "lastLoginDate", null);
        setField(term4220442, term4220442.getClass(), "lastPlayDate", null);
        setIntField(term4220442, term4220442.getClass(), "lastPlaceId", 0);
        setField(term4220442, term4220442.getClass(), "lastPlaceName", null);
        setField(term4220442, term4220442.getClass(), "lastRegionId", null);
        setField(term4220442, term4220442.getClass(), "lastRegionName", null);
        setField(term4220442, term4220442.getClass(), "lastAllNetId", null);
        setField(term4220442, term4220442.getClass(), "lastClientId", null);
        setField(term4220442, term4220442.getClass(), "lastCountryCode", null);
        setField(term4220442, term4220442.getClass(), "userNameEx", null);
        setField(term4220442, term4220442.getClass(), "compatibleCmVersion", null);
        setIntField(term4220442, term4220442.getClass(), "medal", 0);
        setIntField(term4220442, term4220442.getClass(), "mapIconId", 0);
        setIntField(term4220442, term4220442.getClass(), "voiceId", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarWear", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarHead", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarFace", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarSkin", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarItem", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarFront", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarBack", 0);
        setIntField(term4220442, term4220442.getClass(), "classEmblemBase", 0);
        setIntField(term4220442, term4220442.getClass(), "classEmblemMedal", 0);
        setIntField(term4220442, term4220442.getClass(), "stockedGridCount", 0);
        setIntField(term4220442, term4220442.getClass(), "exMapLoopCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattleWinCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220442, term4220442.getClass(), "charaIllustId", 0);
        setIntField(term4220442, term4220442.getClass(), "skillId", 0);
        setIntField(term4220442, term4220442.getClass(), "overPowerPoint", 0);
        setIntField(term4220442, term4220442.getClass(), "overPowerRate", 0);
        setIntField(term4220442, term4220442.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220442, term4220442.getClass(), "avatarPoint", 0);
        setIntField(term4220442, term4220442.getClass(), "battleRankId", 0);
        setIntField(term4220442, term4220442.getClass(), "battleRankPoint", 0);
        setIntField(term4220442, term4220442.getClass(), "eliteRankPoint", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattle1stCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattle4thCount", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattleCorrection", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220442, term4220442.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220442, term4220442.getClass(), "battleRewardStatus", 0);
        setIntField(term4220442, term4220442.getClass(), "battleRewardIndex", 0);
        setIntField(term4220442, term4220442.getClass(), "battleRewardCount", 0);
        setIntField(term4220442, term4220442.getClass(), "ext1", 0);
        setIntField(term4220442, term4220442.getClass(), "ext2", 0);
        setIntField(term4220442, term4220442.getClass(), "ext3", 0);
        setIntField(term4220442, term4220442.getClass(), "ext4", 0);
        setIntField(term4220442, term4220442.getClass(), "ext5", 0);
        setIntField(term4220442, term4220442.getClass(), "ext6", 0);
        setIntField(term4220442, term4220442.getClass(), "ext7", 0);
        setIntField(term4220442, term4220442.getClass(), "ext8", 0);
        setIntField(term4220442, term4220442.getClass(), "ext9", 0);
        setIntField(term4220442, term4220442.getClass(), "ext10", 0);
        setField(term4220442, term4220442.getClass(), "extStr1", null);
        setField(term4220442, term4220442.getClass(), "extStr2", null);
        setLongField(term4220442, term4220442.getClass(), "extLong1", 0L);
        setLongField(term4220442, term4220442.getClass(), "extLong2", 0L);
        setField(term4220442, term4220442.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220442, term4220442.getClass(), "isNetBattleHost", false);
        setIntField(term4220442, term4220442.getClass(), "netBattleEndState", 0);
        term4220519 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4220519;
        callMethod(klass, "setMultiPlayCount", argTypes, term4220442, args);
    }

};


