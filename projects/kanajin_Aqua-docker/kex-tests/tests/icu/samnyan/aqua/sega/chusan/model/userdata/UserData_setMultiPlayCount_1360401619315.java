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

public class UserData_setMultiPlayCount_1360401619315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285841;
     Object term285918;

    public UserData_setMultiPlayCount_1360401619315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285841 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285841, term285841.getClass(), "id", 0L);
        setField(term285841, term285841.getClass(), "card", null);
        setField(term285841, term285841.getClass(), "userName", null);
        setIntField(term285841, term285841.getClass(), "level", 0);
        setIntField(term285841, term285841.getClass(), "reincarnationNum", 0);
        setField(term285841, term285841.getClass(), "exp", null);
        setLongField(term285841, term285841.getClass(), "point", 0L);
        setLongField(term285841, term285841.getClass(), "totalPoint", 0L);
        setIntField(term285841, term285841.getClass(), "playCount", 0);
        setIntField(term285841, term285841.getClass(), "multiPlayCount", 0);
        setIntField(term285841, term285841.getClass(), "playerRating", 0);
        setIntField(term285841, term285841.getClass(), "highestRating", 0);
        setIntField(term285841, term285841.getClass(), "nameplateId", 0);
        setIntField(term285841, term285841.getClass(), "frameId", 0);
        setIntField(term285841, term285841.getClass(), "characterId", 0);
        setIntField(term285841, term285841.getClass(), "trophyId", 0);
        setIntField(term285841, term285841.getClass(), "playedTutorialBit", 0);
        setIntField(term285841, term285841.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285841, term285841.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285841, term285841.getClass(), "totalMapNum", 0);
        setLongField(term285841, term285841.getClass(), "totalHiScore", 0L);
        setLongField(term285841, term285841.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285841, term285841.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285841, term285841.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285841, term285841.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285841, term285841.getClass(), "totalUltimaHighScore", 0L);
        setField(term285841, term285841.getClass(), "eventWatchedDate", null);
        setIntField(term285841, term285841.getClass(), "friendCount", 0);
        setField(term285841, term285841.getClass(), "firstGameId", null);
        setField(term285841, term285841.getClass(), "firstRomVersion", null);
        setField(term285841, term285841.getClass(), "firstDataVersion", null);
        setField(term285841, term285841.getClass(), "firstPlayDate", null);
        setField(term285841, term285841.getClass(), "lastGameId", null);
        setField(term285841, term285841.getClass(), "lastRomVersion", null);
        setField(term285841, term285841.getClass(), "lastDataVersion", null);
        setField(term285841, term285841.getClass(), "lastLoginDate", null);
        setField(term285841, term285841.getClass(), "lastPlayDate", null);
        setIntField(term285841, term285841.getClass(), "lastPlaceId", 0);
        setField(term285841, term285841.getClass(), "lastPlaceName", null);
        setField(term285841, term285841.getClass(), "lastRegionId", null);
        setField(term285841, term285841.getClass(), "lastRegionName", null);
        setField(term285841, term285841.getClass(), "lastAllNetId", null);
        setField(term285841, term285841.getClass(), "lastClientId", null);
        setField(term285841, term285841.getClass(), "lastCountryCode", null);
        setField(term285841, term285841.getClass(), "userNameEx", null);
        setField(term285841, term285841.getClass(), "compatibleCmVersion", null);
        setIntField(term285841, term285841.getClass(), "medal", 0);
        setIntField(term285841, term285841.getClass(), "mapIconId", 0);
        setIntField(term285841, term285841.getClass(), "voiceId", 0);
        setIntField(term285841, term285841.getClass(), "avatarWear", 0);
        setIntField(term285841, term285841.getClass(), "avatarHead", 0);
        setIntField(term285841, term285841.getClass(), "avatarFace", 0);
        setIntField(term285841, term285841.getClass(), "avatarSkin", 0);
        setIntField(term285841, term285841.getClass(), "avatarItem", 0);
        setIntField(term285841, term285841.getClass(), "avatarFront", 0);
        setIntField(term285841, term285841.getClass(), "avatarBack", 0);
        setIntField(term285841, term285841.getClass(), "classEmblemBase", 0);
        setIntField(term285841, term285841.getClass(), "classEmblemMedal", 0);
        setIntField(term285841, term285841.getClass(), "stockedGridCount", 0);
        setIntField(term285841, term285841.getClass(), "exMapLoopCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattlePlayCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattleWinCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattleLoseCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285841, term285841.getClass(), "charaIllustId", 0);
        setIntField(term285841, term285841.getClass(), "skillId", 0);
        setIntField(term285841, term285841.getClass(), "overPowerPoint", 0);
        setIntField(term285841, term285841.getClass(), "overPowerRate", 0);
        setIntField(term285841, term285841.getClass(), "overPowerLowerRank", 0);
        setIntField(term285841, term285841.getClass(), "avatarPoint", 0);
        setIntField(term285841, term285841.getClass(), "battleRankId", 0);
        setIntField(term285841, term285841.getClass(), "battleRankPoint", 0);
        setIntField(term285841, term285841.getClass(), "eliteRankPoint", 0);
        setIntField(term285841, term285841.getClass(), "netBattle1stCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattle2ndCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattle3rdCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattle4thCount", 0);
        setIntField(term285841, term285841.getClass(), "netBattleCorrection", 0);
        setIntField(term285841, term285841.getClass(), "netBattleErrCnt", 0);
        setIntField(term285841, term285841.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285841, term285841.getClass(), "battleRewardStatus", 0);
        setIntField(term285841, term285841.getClass(), "battleRewardIndex", 0);
        setIntField(term285841, term285841.getClass(), "battleRewardCount", 0);
        setIntField(term285841, term285841.getClass(), "ext1", 0);
        setIntField(term285841, term285841.getClass(), "ext2", 0);
        setIntField(term285841, term285841.getClass(), "ext3", 0);
        setIntField(term285841, term285841.getClass(), "ext4", 0);
        setIntField(term285841, term285841.getClass(), "ext5", 0);
        setIntField(term285841, term285841.getClass(), "ext6", 0);
        setIntField(term285841, term285841.getClass(), "ext7", 0);
        setIntField(term285841, term285841.getClass(), "ext8", 0);
        setIntField(term285841, term285841.getClass(), "ext9", 0);
        setIntField(term285841, term285841.getClass(), "ext10", 0);
        setField(term285841, term285841.getClass(), "extStr1", null);
        setField(term285841, term285841.getClass(), "extStr2", null);
        setLongField(term285841, term285841.getClass(), "extLong1", 0L);
        setLongField(term285841, term285841.getClass(), "extLong2", 0L);
        setField(term285841, term285841.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285841, term285841.getClass(), "isNetBattleHost", false);
        setIntField(term285841, term285841.getClass(), "netBattleEndState", 0);
        term285918 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term285918;
        callMethod(klass, "setMultiPlayCount", argTypes, term285841, args);
    }

};


