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

public class UserData_setPlayedTutorialBit_388571895322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286394;
     Object term286471;

    public UserData_setPlayedTutorialBit_388571895322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286394 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286394, term286394.getClass(), "id", 0L);
        setField(term286394, term286394.getClass(), "card", null);
        setField(term286394, term286394.getClass(), "userName", null);
        setIntField(term286394, term286394.getClass(), "level", 0);
        setIntField(term286394, term286394.getClass(), "reincarnationNum", 0);
        setField(term286394, term286394.getClass(), "exp", null);
        setLongField(term286394, term286394.getClass(), "point", 0L);
        setLongField(term286394, term286394.getClass(), "totalPoint", 0L);
        setIntField(term286394, term286394.getClass(), "playCount", 0);
        setIntField(term286394, term286394.getClass(), "multiPlayCount", 0);
        setIntField(term286394, term286394.getClass(), "playerRating", 0);
        setIntField(term286394, term286394.getClass(), "highestRating", 0);
        setIntField(term286394, term286394.getClass(), "nameplateId", 0);
        setIntField(term286394, term286394.getClass(), "frameId", 0);
        setIntField(term286394, term286394.getClass(), "characterId", 0);
        setIntField(term286394, term286394.getClass(), "trophyId", 0);
        setIntField(term286394, term286394.getClass(), "playedTutorialBit", 0);
        setIntField(term286394, term286394.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286394, term286394.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286394, term286394.getClass(), "totalMapNum", 0);
        setLongField(term286394, term286394.getClass(), "totalHiScore", 0L);
        setLongField(term286394, term286394.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286394, term286394.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286394, term286394.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286394, term286394.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286394, term286394.getClass(), "totalUltimaHighScore", 0L);
        setField(term286394, term286394.getClass(), "eventWatchedDate", null);
        setIntField(term286394, term286394.getClass(), "friendCount", 0);
        setField(term286394, term286394.getClass(), "firstGameId", null);
        setField(term286394, term286394.getClass(), "firstRomVersion", null);
        setField(term286394, term286394.getClass(), "firstDataVersion", null);
        setField(term286394, term286394.getClass(), "firstPlayDate", null);
        setField(term286394, term286394.getClass(), "lastGameId", null);
        setField(term286394, term286394.getClass(), "lastRomVersion", null);
        setField(term286394, term286394.getClass(), "lastDataVersion", null);
        setField(term286394, term286394.getClass(), "lastLoginDate", null);
        setField(term286394, term286394.getClass(), "lastPlayDate", null);
        setIntField(term286394, term286394.getClass(), "lastPlaceId", 0);
        setField(term286394, term286394.getClass(), "lastPlaceName", null);
        setField(term286394, term286394.getClass(), "lastRegionId", null);
        setField(term286394, term286394.getClass(), "lastRegionName", null);
        setField(term286394, term286394.getClass(), "lastAllNetId", null);
        setField(term286394, term286394.getClass(), "lastClientId", null);
        setField(term286394, term286394.getClass(), "lastCountryCode", null);
        setField(term286394, term286394.getClass(), "userNameEx", null);
        setField(term286394, term286394.getClass(), "compatibleCmVersion", null);
        setIntField(term286394, term286394.getClass(), "medal", 0);
        setIntField(term286394, term286394.getClass(), "mapIconId", 0);
        setIntField(term286394, term286394.getClass(), "voiceId", 0);
        setIntField(term286394, term286394.getClass(), "avatarWear", 0);
        setIntField(term286394, term286394.getClass(), "avatarHead", 0);
        setIntField(term286394, term286394.getClass(), "avatarFace", 0);
        setIntField(term286394, term286394.getClass(), "avatarSkin", 0);
        setIntField(term286394, term286394.getClass(), "avatarItem", 0);
        setIntField(term286394, term286394.getClass(), "avatarFront", 0);
        setIntField(term286394, term286394.getClass(), "avatarBack", 0);
        setIntField(term286394, term286394.getClass(), "classEmblemBase", 0);
        setIntField(term286394, term286394.getClass(), "classEmblemMedal", 0);
        setIntField(term286394, term286394.getClass(), "stockedGridCount", 0);
        setIntField(term286394, term286394.getClass(), "exMapLoopCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattlePlayCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattleWinCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattleLoseCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286394, term286394.getClass(), "charaIllustId", 0);
        setIntField(term286394, term286394.getClass(), "skillId", 0);
        setIntField(term286394, term286394.getClass(), "overPowerPoint", 0);
        setIntField(term286394, term286394.getClass(), "overPowerRate", 0);
        setIntField(term286394, term286394.getClass(), "overPowerLowerRank", 0);
        setIntField(term286394, term286394.getClass(), "avatarPoint", 0);
        setIntField(term286394, term286394.getClass(), "battleRankId", 0);
        setIntField(term286394, term286394.getClass(), "battleRankPoint", 0);
        setIntField(term286394, term286394.getClass(), "eliteRankPoint", 0);
        setIntField(term286394, term286394.getClass(), "netBattle1stCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattle2ndCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattle3rdCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattle4thCount", 0);
        setIntField(term286394, term286394.getClass(), "netBattleCorrection", 0);
        setIntField(term286394, term286394.getClass(), "netBattleErrCnt", 0);
        setIntField(term286394, term286394.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286394, term286394.getClass(), "battleRewardStatus", 0);
        setIntField(term286394, term286394.getClass(), "battleRewardIndex", 0);
        setIntField(term286394, term286394.getClass(), "battleRewardCount", 0);
        setIntField(term286394, term286394.getClass(), "ext1", 0);
        setIntField(term286394, term286394.getClass(), "ext2", 0);
        setIntField(term286394, term286394.getClass(), "ext3", 0);
        setIntField(term286394, term286394.getClass(), "ext4", 0);
        setIntField(term286394, term286394.getClass(), "ext5", 0);
        setIntField(term286394, term286394.getClass(), "ext6", 0);
        setIntField(term286394, term286394.getClass(), "ext7", 0);
        setIntField(term286394, term286394.getClass(), "ext8", 0);
        setIntField(term286394, term286394.getClass(), "ext9", 0);
        setIntField(term286394, term286394.getClass(), "ext10", 0);
        setField(term286394, term286394.getClass(), "extStr1", null);
        setField(term286394, term286394.getClass(), "extStr2", null);
        setLongField(term286394, term286394.getClass(), "extLong1", 0L);
        setLongField(term286394, term286394.getClass(), "extLong2", 0L);
        setField(term286394, term286394.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286394, term286394.getClass(), "isNetBattleHost", false);
        setIntField(term286394, term286394.getClass(), "netBattleEndState", 0);
        term286471 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286471;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term286394, args);
    }

};


